package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.TrQuestionBanks;

/**
 * 题库管理Service接口
 * 
 * @author bigluobo
 * @date 2023-05-21
 */
public interface ITrQuestionBanksService 
{
    /**
     * 查询题库管理
     * 
     * @param id 题库管理主键
     * @return 题库管理
     */
    public TrQuestionBanks selectTrQuestionBanksById(Long id);

    /**
     * 查询题库管理列表
     * 
     * @param trQuestionBanks 题库管理
     * @return 题库管理集合
     */
    public List<TrQuestionBanks> selectTrQuestionBanksList(TrQuestionBanks trQuestionBanks);

    /**
     * 新增题库管理
     * 
     * @param trQuestionBanks 题库管理
     * @return 结果
     */
    public int insertTrQuestionBanks(TrQuestionBanks trQuestionBanks);

    /**
     * 修改题库管理
     * 
     * @param trQuestionBanks 题库管理
     * @return 结果
     */
    public int updateTrQuestionBanks(TrQuestionBanks trQuestionBanks);

    /**
     * 批量删除题库管理
     * 
     * @param ids 需要删除的题库管理主键集合
     * @return 结果
     */
    public int deleteTrQuestionBanksByIds(Long[] ids);

    /**
     * 删除题库管理信息
     * 
     * @param id 题库管理主键
     * @return 结果
     */
    public int deleteTrQuestionBanksById(Long id);
}
