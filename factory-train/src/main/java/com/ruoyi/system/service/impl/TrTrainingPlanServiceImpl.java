package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TrTrainingPlanMapper;
import com.ruoyi.system.domain.TrTrainingPlan;
import com.ruoyi.system.service.ITrTrainingPlanService;

/**
 * 培训计划Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-12
 */
@Service
public class TrTrainingPlanServiceImpl implements ITrTrainingPlanService 
{
    @Autowired
    private TrTrainingPlanMapper trTrainingPlanMapper;

    /**
     * 查询培训计划
     * 
     * @param id 培训计划主键
     * @return 培训计划
     */
    @Override
    public TrTrainingPlan selectTrTrainingPlanById(Long id)
    {
        return trTrainingPlanMapper.selectTrTrainingPlanById(id);
    }

    /**
     * 查询培训计划列表
     * 
     * @param trTrainingPlan 培训计划
     * @return 培训计划
     */
    @Override
    public List<TrTrainingPlan> selectTrTrainingPlanList(TrTrainingPlan trTrainingPlan)
    {
        return trTrainingPlanMapper.selectTrTrainingPlanList(trTrainingPlan);
    }

    /**
     * 新增培训计划
     * 
     * @param trTrainingPlan 培训计划
     * @return 结果
     */
    @Override
    public int insertTrTrainingPlan(TrTrainingPlan trTrainingPlan)
    {
        return trTrainingPlanMapper.insertTrTrainingPlan(trTrainingPlan);
    }

    /**
     * 修改培训计划
     * 
     * @param trTrainingPlan 培训计划
     * @return 结果
     */
    @Override
    public int updateTrTrainingPlan(TrTrainingPlan trTrainingPlan)
    {
        return trTrainingPlanMapper.updateTrTrainingPlan(trTrainingPlan);
    }

    /**
     * 批量删除培训计划
     * 
     * @param ids 需要删除的培训计划主键
     * @return 结果
     */
    @Override
    public int deleteTrTrainingPlanByIds(Long[] ids)
    {
        return trTrainingPlanMapper.deleteTrTrainingPlanByIds(ids);
    }

    /**
     * 删除培训计划信息
     * 
     * @param id 培训计划主键
     * @return 结果
     */
    @Override
    public int deleteTrTrainingPlanById(Long id)
    {
        return trTrainingPlanMapper.deleteTrTrainingPlanById(id);
    }
}
