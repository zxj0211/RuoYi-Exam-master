package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.TrTrainingPlan;

/**
 * 培训计划Service接口
 * 
 * @author ruoyi
 * @date 2023-05-12
 */
public interface ITrTrainingPlanService 
{
    /**
     * 查询培训计划
     * 
     * @param id 培训计划主键
     * @return 培训计划
     */
    public TrTrainingPlan selectTrTrainingPlanById(Long id);

    /**
     * 查询培训计划列表
     * 
     * @param trTrainingPlan 培训计划
     * @return 培训计划集合
     */
    public List<TrTrainingPlan> selectTrTrainingPlanList(TrTrainingPlan trTrainingPlan);

    /**
     * 新增培训计划
     * 
     * @param trTrainingPlan 培训计划
     * @return 结果
     */
    public int insertTrTrainingPlan(TrTrainingPlan trTrainingPlan);

    /**
     * 修改培训计划
     * 
     * @param trTrainingPlan 培训计划
     * @return 结果
     */
    public int updateTrTrainingPlan(TrTrainingPlan trTrainingPlan);

    /**
     * 批量删除培训计划
     * 
     * @param ids 需要删除的培训计划主键集合
     * @return 结果
     */
    public int deleteTrTrainingPlanByIds(Long[] ids);

    /**
     * 删除培训计划信息
     * 
     * @param id 培训计划主键
     * @return 结果
     */
    public int deleteTrTrainingPlanById(Long id);
}
