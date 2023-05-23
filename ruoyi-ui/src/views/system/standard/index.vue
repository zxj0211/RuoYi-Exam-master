<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="标准名称" prop="standardName">
        <el-input
          v-model="queryParams.standardName"
          placeholder="请输入标准名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="标准描述" prop="standardDescription">
        <el-input
          v-model="queryParams.standardDescription"
          placeholder="请输入标准描述"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="文件存储路径url" prop="fileUrl">
        <el-input
          v-model="queryParams.fileUrl"
          placeholder="请输入文件存储路径url"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          plain
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['system:standard:add']"
        >新增</el-button>
      </el-col>
<!--      <el-col :span="1.5">
        <el-button
          type="success"
          plain
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['system:standard:edit']"
        >修改</el-button>
      </el-col>-->
      <el-col :span="1.5">
        <el-button
          type="danger"
          plain
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['system:standard:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:standard:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="standardList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
<!--      <el-table-column label="标准ID" align="center" prop="standardId" />-->
      <el-table-column label="标准名称" align="center" prop="standardName" />
      <el-table-column label="标准描述" align="center" prop="standardDescription" />
<!--      <el-table-column label="文件下载" align="center" prop="fileUrl" />-->
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
<!--          <el-button
            type="warning"
            plain
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:standard:edit']"
          >修改</el-button>-->
          <el-button
            type="warning"
            plain
            icon="el-icon-arrow-up"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:standard:upload']"
          >替换标准</el-button>

          <el-button
            type="primary"
            plain
            icon="el-icon-arrow-down"
            @click="downloadFile(scope.row)"
            v-hasPermi="['system:standard:download']"
          >下载标准</el-button>

<!--          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:standard:remove']"
          >删除</el-button>-->
        </template>
      </el-table-column>
    </el-table>

    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 上传相应标准文档资料 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px" enctype="multipart/form-data">
        <el-form-item label="文件" prop="file">
          <img :src="form.data" style="width:50%;height:50%"  >
          <input type="file" id="file_input" >

        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
        <el-button @click="downloadfile">下载</el-button>
      </div>
    </el-dialog>

  </div>
</template>

<script>
import { listStandard, getStandard, delStandard, addStandard, updateStandard } from "@/api/system/standard";

export default {
  name: "Standard",
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // 企业人力资源管理标准管理表格数据
      standardList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        standardName: null,
        standardDescription: null,
        fileUrl: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
        standardName: [
          { required: true, message: "标准名称不能为空", trigger: "blur" }
        ],
        fileUrl: [
          { required: true, message: "文件存储路径url不能为空", trigger: "blur" }
        ]
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询企业人力资源管理标准管理列表 */
    getList() {
      this.loading = true;
      listStandard(this.queryParams).then(response => {
        this.standardList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        standardId: null,
        standardName: null,
        standardDescription: null,
        fileUrl: null
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.standardId)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加企业人力资源管理标准管理";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const standardId = row.standardId || this.ids
      getStandard(standardId).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改企业人力资源管理标准管理";
      });
    },
    /*文件上传*/
    uploadFile(){

    },
    /*下载上传*/
    downloadFile(){
      this.queryParams.filename=this.form.filename;
      const queryParams = this.queryParams;

      this.$confirm('是否确认下载?', "警告", {
        confirmButtonText: "确定",
        cancelButtonText: "取消",
        type: "warning"
      }).then(function() {
        return downloadBin(queryParams);
      }).then(response => {
        this.download(response.msg);
      }).catch(function() {});
    },

    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.standardId != null) {
            updateStandard(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addStandard(this.form).then(response => {
              this.$modal.msgSuccess("新增成功");
              this.open = false;
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const standardIds = row.standardId || this.ids;
      this.$modal.confirm('是否确认删除企业人力资源管理标准管理编号为"' + standardIds + '"的数据项？').then(function() {
        return delStandard(standardIds);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/standard/export', {
        ...this.queryParams
      }, `standard_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
