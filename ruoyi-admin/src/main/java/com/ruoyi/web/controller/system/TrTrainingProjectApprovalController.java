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
import com.ruoyi.system.domain.TrTrainingProjectApproval;
import com.ruoyi.system.service.ITrTrainingProjectApprovalService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 项目审批Controller
 *
 * @author bigluobo
 * @date 2023-05-12
 */
@RestController
@RequestMapping("/system/approval")
public class TrTrainingProjectApprovalController extends BaseController
{
    @Autowired
    private ITrTrainingProjectApprovalService trTrainingProjectApprovalService;

    /**
     * 查询项目审批列表
     */
    @PreAuthorize("@ss.hasPermi('system:approval:list')")
    @GetMapping("/list")
    public TableDataInfo list(TrTrainingProjectApproval trTrainingProjectApproval)
    {
        startPage();
        List<TrTrainingProjectApproval> list = trTrainingProjectApprovalService.selectTrTrainingProjectApprovalList(trTrainingProjectApproval);
        return getDataTable(list);
    }

    /**
     * 导出项目审批列表
     */
    @PreAuthorize("@ss.hasPermi('system:approval:export')")
    @Log(title = "项目审批", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TrTrainingProjectApproval trTrainingProjectApproval)
    {
        List<TrTrainingProjectApproval> list = trTrainingProjectApprovalService.selectTrTrainingProjectApprovalList(trTrainingProjectApproval);
        ExcelUtil<TrTrainingProjectApproval> util = new ExcelUtil<TrTrainingProjectApproval>(TrTrainingProjectApproval.class);
        util.exportExcel(response, list, "项目审批数据");
    }

    /**
     * 获取项目审批详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:approval:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(trTrainingProjectApprovalService.selectTrTrainingProjectApprovalById(id));
    }

    /**
     * 新增项目审批
     */
    @PreAuthorize("@ss.hasPermi('system:approval:add')")
    @Log(title = "项目审批", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TrTrainingProjectApproval trTrainingProjectApproval)
    {
        return toAjax(trTrainingProjectApprovalService.insertTrTrainingProjectApproval(trTrainingProjectApproval));
    }

    /**
     * 修改项目审批
     */
    @PreAuthorize("@ss.hasPermi('system:approval:edit')")
    @Log(title = "项目审批", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TrTrainingProjectApproval trTrainingProjectApproval)
    {
        return toAjax(trTrainingProjectApprovalService.updateTrTrainingProjectApproval(trTrainingProjectApproval));
    }

    /**
     * 删除项目审批
     */
    @PreAuthorize("@ss.hasPermi('system:approval:remove')")
    @Log(title = "项目审批", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(trTrainingProjectApprovalService.deleteTrTrainingProjectApprovalByIds(ids));
    }
}
