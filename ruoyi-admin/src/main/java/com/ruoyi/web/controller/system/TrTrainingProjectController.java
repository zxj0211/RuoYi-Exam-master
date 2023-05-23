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
import com.ruoyi.system.domain.TrTrainingProject;
import com.ruoyi.system.service.ITrTrainingProjectService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 培训项目Controller
 *
 * @author bigluobo
 * @date 2023-05-12
 */
@RestController
@RequestMapping("/system/project")
public class TrTrainingProjectController extends BaseController
{
    @Autowired
    private ITrTrainingProjectService trTrainingProjectService;

    /**
     * 查询培训项目列表
     */
    @PreAuthorize("@ss.hasPermi('system:project:list')")
    @GetMapping("/list")
    public TableDataInfo list(TrTrainingProject trTrainingProject)
    {
        startPage();
        List<TrTrainingProject> list = trTrainingProjectService.selectTrTrainingProjectList(trTrainingProject);
        return getDataTable(list);
    }

    /**
     * 导出培训项目列表
     */
    @PreAuthorize("@ss.hasPermi('system:project:export')")
    @Log(title = "培训项目", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TrTrainingProject trTrainingProject)
    {
        List<TrTrainingProject> list = trTrainingProjectService.selectTrTrainingProjectList(trTrainingProject);
        ExcelUtil<TrTrainingProject> util = new ExcelUtil<TrTrainingProject>(TrTrainingProject.class);
        util.exportExcel(response, list, "培训项目数据");
    }

    /**
     * 获取培训项目详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:project:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(trTrainingProjectService.selectTrTrainingProjectById(id));
    }

    /**
     * 新增培训项目
     */
    @PreAuthorize("@ss.hasPermi('system:project:add')")
    @Log(title = "培训项目", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TrTrainingProject trTrainingProject)
    {
        return toAjax(trTrainingProjectService.insertTrTrainingProject(trTrainingProject));
    }

    /**
     * 修改培训项目
     */
    @PreAuthorize("@ss.hasPermi('system:project:edit')")
    @Log(title = "培训项目", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TrTrainingProject trTrainingProject)
    {
        return toAjax(trTrainingProjectService.updateTrTrainingProject(trTrainingProject));
    }

    /**
     * 删除培训项目
     */
    @PreAuthorize("@ss.hasPermi('system:project:remove')")
    @Log(title = "培训项目", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(trTrainingProjectService.deleteTrTrainingProjectByIds(ids));
    }
}
