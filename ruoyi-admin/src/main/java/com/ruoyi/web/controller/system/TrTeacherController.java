package com.ruoyi.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.TrTeacher;
import com.ruoyi.system.service.ITrTeacherService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 师资Controller
 *
 * @author ruoyi
 * @date 2023-05-12
 */
@RestController
@RequestMapping("/system/teacher")
public class TrTeacherController extends BaseController
{
    @Autowired
    private ITrTeacherService trTeacherService;

    /**
     * 查询师资列表
     */
    @PreAuthorize("@ss.hasPermi('system:teacher:list')")
    @GetMapping("/list")
    public TableDataInfo list(TrTeacher trTeacher)
    {
        startPage();
        List<TrTeacher> list = trTeacherService.selectTrTeacherList(trTeacher);
        return getDataTable(list);
    }

    /**
     * 导出师资列表
     */
    @PreAuthorize("@ss.hasPermi('system:teacher:export')")
    @Log(title = "师资", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TrTeacher trTeacher)
    {
        List<TrTeacher> list = trTeacherService.selectTrTeacherList(trTeacher);
        ExcelUtil<TrTeacher> util = new ExcelUtil<TrTeacher>(TrTeacher.class);
        util.exportExcel(response, list, "师资数据");
    }

    /**
     * 获取师资详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:teacher:query')")
    @GetMapping(value = "/{teacherId}")
    public AjaxResult getInfo(@PathVariable("teacherId") Long teacherId)
    {
        return success(trTeacherService.selectTrTeacherByTeacherId(teacherId));
    }

    /**
     * 新增师资
     */
    @PreAuthorize("@ss.hasPermi('system:teacher:add')")
    @Log(title = "师资", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TrTeacher trTeacher)
    {
        return toAjax(trTeacherService.insertTrTeacher(trTeacher));
    }

    /**
     * 修改师资
     */
    @PreAuthorize("@ss.hasPermi('system:teacher:edit')")
    @Log(title = "师资", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TrTeacher trTeacher)
    {
        return toAjax(trTeacherService.updateTrTeacher(trTeacher));
    }

    /**
     * 删除师资
     */
    @PreAuthorize("@ss.hasPermi('system:teacher:remove')")
    @Log(title = "师资", businessType = BusinessType.DELETE)
	@DeleteMapping("/{teacherIds}")
    public AjaxResult remove(@PathVariable Long[] teacherIds)
    {
        return toAjax(trTeacherService.deleteTrTeacherByTeacherIds(teacherIds));
    }
}
