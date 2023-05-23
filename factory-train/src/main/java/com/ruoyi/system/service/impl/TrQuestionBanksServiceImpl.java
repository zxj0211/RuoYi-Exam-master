package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TrQuestionBanksMapper;
import com.ruoyi.system.domain.TrQuestionBanks;
import com.ruoyi.system.service.ITrQuestionBanksService;

/**
 * 题库管理Service业务层处理
 * 
 * @author bigluobo
 * @date 2023-05-21
 */
@Service
public class TrQuestionBanksServiceImpl implements ITrQuestionBanksService 
{
    @Autowired
    private TrQuestionBanksMapper trQuestionBanksMapper;

    /**
     * 查询题库管理
     * 
     * @param id 题库管理主键
     * @return 题库管理
     */
    @Override
    public TrQuestionBanks selectTrQuestionBanksById(Long id)
    {
        return trQuestionBanksMapper.selectTrQuestionBanksById(id);
    }

    /**
     * 查询题库管理列表
     * 
     * @param trQuestionBanks 题库管理
     * @return 题库管理
     */
    @Override
    public List<TrQuestionBanks> selectTrQuestionBanksList(TrQuestionBanks trQuestionBanks)
    {
        return trQuestionBanksMapper.selectTrQuestionBanksList(trQuestionBanks);
    }

    /**
     * 新增题库管理
     * 
     * @param trQuestionBanks 题库管理
     * @return 结果
     */
    @Override
    public int insertTrQuestionBanks(TrQuestionBanks trQuestionBanks)
    {
        trQuestionBanks.setCreateTime(DateUtils.getNowDate());
        return trQuestionBanksMapper.insertTrQuestionBanks(trQuestionBanks);
    }

    /**
     * 修改题库管理
     * 
     * @param trQuestionBanks 题库管理
     * @return 结果
     */
    @Override
    public int updateTrQuestionBanks(TrQuestionBanks trQuestionBanks)
    {
        return trQuestionBanksMapper.updateTrQuestionBanks(trQuestionBanks);
    }

    /**
     * 批量删除题库管理
     * 
     * @param ids 需要删除的题库管理主键
     * @return 结果
     */
    @Override
    public int deleteTrQuestionBanksByIds(Long[] ids)
    {
        return trQuestionBanksMapper.deleteTrQuestionBanksByIds(ids);
    }

    /**
     * 删除题库管理信息
     * 
     * @param id 题库管理主键
     * @return 结果
     */
    @Override
    public int deleteTrQuestionBanksById(Long id)
    {
        return trQuestionBanksMapper.deleteTrQuestionBanksById(id);
    }
}
