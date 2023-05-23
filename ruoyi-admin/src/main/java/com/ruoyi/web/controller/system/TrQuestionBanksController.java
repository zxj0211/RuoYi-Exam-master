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
import com.ruoyi.system.domain.TrQuestionBanks;
import com.ruoyi.system.service.ITrQuestionBanksService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 题库管理Controller
 *
 * @author bigluobo
 * @date 2023-05-21
 */
@RestController
@RequestMapping("/system/banks")
public class TrQuestionBanksController extends BaseController
{
    @Autowired
    private ITrQuestionBanksService trQuestionBanksService;

    /**
     * 查询题库管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:banks:list')")
    @GetMapping("/list")
    public TableDataInfo list(TrQuestionBanks trQuestionBanks)
    {
        startPage();
        List<TrQuestionBanks> list = trQuestionBanksService.selectTrQuestionBanksList(trQuestionBanks);
        return getDataTable(list);
    }

    /**
     * 导出题库管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:banks:export')")
    @Log(title = "题库管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TrQuestionBanks trQuestionBanks)
    {
        List<TrQuestionBanks> list = trQuestionBanksService.selectTrQuestionBanksList(trQuestionBanks);
        ExcelUtil<TrQuestionBanks> util = new ExcelUtil<TrQuestionBanks>(TrQuestionBanks.class);
        util.exportExcel(response, list, "题库管理数据");
    }

    /**
     * 获取题库管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:banks:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(trQuestionBanksService.selectTrQuestionBanksById(id));
    }

    /**
     * 新增题库管理
     */
    @PreAuthorize("@ss.hasPermi('system:banks:add')")
    @Log(title = "题库管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TrQuestionBanks trQuestionBanks)
    {
        return toAjax(trQuestionBanksService.insertTrQuestionBanks(trQuestionBanks));
    }

    /**
     * 修改题库管理
     */
    @PreAuthorize("@ss.hasPermi('system:banks:edit')")
    @Log(title = "题库管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TrQuestionBanks trQuestionBanks)
    {
        return toAjax(trQuestionBanksService.updateTrQuestionBanks(trQuestionBanks));
    }

    /**
     * 删除题库管理
     */
    @PreAuthorize("@ss.hasPermi('system:banks:remove')")
    @Log(title = "题库管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(trQuestionBanksService.deleteTrQuestionBanksByIds(ids));
    }
}
