package com.ruoyi.web.controller.system;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Base64;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.config.RuoYiConfig;
import com.ruoyi.common.utils.file.FileUploadUtils;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.TrHrStandard;
import com.ruoyi.system.service.ITrHrStandardService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 企业人力资源管理标准管理Controller
 *
 * @author ruoyi
 * @date 2023-05-12
 */
@RestController
@RequestMapping("/system/standard")
public class TrHrStandardController extends BaseController
{
    @Autowired
    private ITrHrStandardService trHrStandardService;

    /**
     * 查询企业人力资源管理标准管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:standard:list')")
    @GetMapping("/list")
    public TableDataInfo list(TrHrStandard trHrStandard)
    {
        startPage();
        List<TrHrStandard> list = trHrStandardService.selectTrHrStandardList(trHrStandard);
        return getDataTable(list);
    }

    /**
     * 导出企业人力资源管理标准管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:standard:export')")
    @Log(title = "企业人力资源管理标准管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TrHrStandard trHrStandard)
    {
        List<TrHrStandard> list = trHrStandardService.selectTrHrStandardList(trHrStandard);
        ExcelUtil<TrHrStandard> util = new ExcelUtil<TrHrStandard>(TrHrStandard.class);
        util.exportExcel(response, list, "企业人力资源管理标准管理数据");
    }

    /**
     * 获取企业人力资源管理标准管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:standard:query')")
    @GetMapping(value = "/{standardId}")
    public AjaxResult getInfo(@PathVariable("standardId") Long standardId)
    {
        return success(trHrStandardService.selectTrHrStandardByStandardId(standardId));
    }

    /**
     * 新增企业人力资源管理标准管理
     */
    @PreAuthorize("@ss.hasPermi('system:standard:add')")
    @Log(title = "企业人力资源管理标准管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TrHrStandard trHrStandard)
    {
        return toAjax(trHrStandardService.insertTrHrStandard(trHrStandard));
    }

    /**
     * 修改企业人力资源管理标准管理
     */
    @PreAuthorize("@ss.hasPermi('system:standard:edit')")
    @Log(title = "企业人力资源管理标准管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TrHrStandard trHrStandard)
    {
        return toAjax(trHrStandardService.updateTrHrStandard(trHrStandard));
    }

    /**
     * 删除企业人力资源管理标准管理
     */
    @PreAuthorize("@ss.hasPermi('system:standard:remove')")
    @Log(title = "企业人力资源管理标准管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{standardIds}")
    public AjaxResult remove(@PathVariable Long[] standardIds)
    {
        return toAjax(trHrStandardService.deleteTrHrStandardByStandardIds(standardIds));
    }
    @PreAuthorize("@ss.hasPermi('system:standard:upload')")
    @Log(title = "企业人力资源管理标准管理", businessType = BusinessType.DELETE)
    @PostMapping("/upload")
    @ResponseBody
    public AjaxResult addSave(@RequestParam("file") MultipartFile file, @RequestParam("fileName") String fileName, TrHrStandard standard) throws IOException
    {
        // 上传文件路径
        String filePath = RuoYiConfig.getUploadPath();
        // 上传并返回新文件名称
        String fileNewName = FileUploadUtils.upload(filePath, file);
        standard.setStandardName(fileName);
        standard.setFileUrl(fileNewName);
        return toAjax(trHrStandardService.insertTrHrStandard(standard));
    }



}

