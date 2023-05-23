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
import com.ruoyi.system.domain.TrPositionCourse;
import com.ruoyi.system.service.ITrPositionCourseService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 岗位课程Controller
 *
 * @author bigluobo
 * @date 2023-05-12
 */
@RestController
@RequestMapping("/position/position_course")
public class TrPositionCourseController extends BaseController
{
    @Autowired
    private ITrPositionCourseService trPositionCourseService;

    /**
     * 查询岗位课程列表
     */
    @PreAuthorize("@ss.hasPermi('position:position_course:list')")
    @GetMapping("/list")
    public TableDataInfo list(TrPositionCourse trPositionCourse)
    {
        startPage();
        List<TrPositionCourse> list = trPositionCourseService.selectTrPositionCourseList(trPositionCourse);
        return getDataTable(list);
    }

    /**
     * 导出岗位课程列表
     */
    @PreAuthorize("@ss.hasPermi('position:position_course:export')")
    @Log(title = "岗位课程", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TrPositionCourse trPositionCourse)
    {
        List<TrPositionCourse> list = trPositionCourseService.selectTrPositionCourseList(trPositionCourse);
        ExcelUtil<TrPositionCourse> util = new ExcelUtil<TrPositionCourse>(TrPositionCourse.class);
        util.exportExcel(response, list, "岗位课程数据");
    }

    /**
     * 获取岗位课程详细信息
     */
    @PreAuthorize("@ss.hasPermi('position:position_course:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(trPositionCourseService.selectTrPositionCourseById(id));
    }

    /**
     * 新增岗位课程
     */
    @PreAuthorize("@ss.hasPermi('position:position_course:add')")
    @Log(title = "岗位课程", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TrPositionCourse trPositionCourse)
    {
        return toAjax(trPositionCourseService.insertTrPositionCourse(trPositionCourse));
    }

    /**
     * 修改岗位课程
     */
    @PreAuthorize("@ss.hasPermi('position:position_course:edit')")
    @Log(title = "岗位课程", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TrPositionCourse trPositionCourse)
    {
        return toAjax(trPositionCourseService.updateTrPositionCourse(trPositionCourse));
    }

    /**
     * 删除岗位课程
     */
    @PreAuthorize("@ss.hasPermi('position:position_course:remove')")
    @Log(title = "岗位课程", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(trPositionCourseService.deleteTrPositionCourseByIds(ids));
    }
}
