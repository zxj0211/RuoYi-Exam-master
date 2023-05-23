package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TrTrainNoticeMapper;
import com.ruoyi.system.domain.TrTrainNotice;
import com.ruoyi.system.service.ITrTrainNoticeService;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2023-05-19
 */
@Service
public class TrTrainNoticeServiceImpl implements ITrTrainNoticeService
{
    @Autowired
    private TrTrainNoticeMapper trTrainNoticeMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public TrTrainNotice selectTrTrainNoticeById(Long id)
    {
        return trTrainNoticeMapper.selectTrTrainNoticeById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param trTrainNotice 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<TrTrainNotice> selectTrTrainNoticeList(TrTrainNotice trTrainNotice)
    {
        return trTrainNoticeMapper.selectTrTrainNoticeList(trTrainNotice);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param trTrainNotice 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertTrTrainNotice(TrTrainNotice trTrainNotice)
    {
        return trTrainNoticeMapper.insertTrTrainNotice(trTrainNotice);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param trTrainNotice 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateTrTrainNotice(TrTrainNotice trTrainNotice)
    {
        return trTrainNoticeMapper.updateTrTrainNotice(trTrainNotice);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteTrTrainNoticeByIds(Long[] ids)
    {
        return trTrainNoticeMapper.deleteTrTrainNoticeByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteTrTrainNoticeById(Long id)
    {
        return trTrainNoticeMapper.deleteTrTrainNoticeById(id);
    }
}
