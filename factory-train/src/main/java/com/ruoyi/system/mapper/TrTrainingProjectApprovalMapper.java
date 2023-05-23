package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.TrTrainingProjectApproval;

/**
 * 项目审批Mapper接口
 * 
 * @author bigluobo
 * @date 2023-05-12
 */
public interface TrTrainingProjectApprovalMapper 
{
    /**
     * 查询项目审批
     * 
     * @param id 项目审批主键
     * @return 项目审批
     */
    public TrTrainingProjectApproval selectTrTrainingProjectApprovalById(Long id);

    /**
     * 查询项目审批列表
     * 
     * @param trTrainingProjectApproval 项目审批
     * @return 项目审批集合
     */
    public List<TrTrainingProjectApproval> selectTrTrainingProjectApprovalList(TrTrainingProjectApproval trTrainingProjectApproval);

    /**
     * 新增项目审批
     * 
     * @param trTrainingProjectApproval 项目审批
     * @return 结果
     */
    public int insertTrTrainingProjectApproval(TrTrainingProjectApproval trTrainingProjectApproval);

    /**
     * 修改项目审批
     * 
     * @param trTrainingProjectApproval 项目审批
     * @return 结果
     */
    public int updateTrTrainingProjectApproval(TrTrainingProjectApproval trTrainingProjectApproval);

    /**
     * 删除项目审批
     * 
     * @param id 项目审批主键
     * @return 结果
     */
    public int deleteTrTrainingProjectApprovalById(Long id);

    /**
     * 批量删除项目审批
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTrTrainingProjectApprovalByIds(Long[] ids);
}
