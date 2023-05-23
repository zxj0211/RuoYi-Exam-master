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
import com.ruoyi.system.domain.TrTrainNotice;
import com.ruoyi.system.service.ITrTrainNoticeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 *
 * @author ruoyi
 * @date 2023-05-19
 */
@RestController
@RequestMapping("/system/trainnotice")
public class TrTrainNoticeController extends BaseController
{
    @Autowired
    private ITrTrainNoticeService trTrainNoticeService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:trainnotice:list')")
    @GetMapping("/list")
    public TableDataInfo list(TrTrainNotice trTrainNotice)
    {
        startPage();
        List<TrTrainNotice> list = trTrainNoticeService.selectTrTrainNoticeList(trTrainNotice);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:trainnotice:export')")
    @Log(title = "培训通知导出", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TrTrainNotice trTrainNotice)
    {
        List<TrTrainNotice> list = trTrainNoticeService.selectTrTrainNoticeList(trTrainNotice);
        ExcelUtil<TrTrainNotice> util = new ExcelUtil<TrTrainNotice>(TrTrainNotice.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:trainnotice:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(trTrainNoticeService.selectTrTrainNoticeById(id));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:trainnotice:add')")
    @Log(title = "添加培训通知", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TrTrainNotice trTrainNotice)
    {
        return toAjax(trTrainNoticeService.insertTrTrainNotice(trTrainNotice));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:trainnotice:edit')")
    @Log(title = "编辑培训通知", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TrTrainNotice trTrainNotice)
    {
        return toAjax(trTrainNoticeService.updateTrTrainNotice(trTrainNotice));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:trainnotice:remove')")
    @Log(title = "删除培训通知", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(trTrainNoticeService.deleteTrTrainNoticeByIds(ids));
    }
}
