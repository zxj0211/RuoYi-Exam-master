package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TrTrainingProjectApprovalMapper;
import com.ruoyi.system.domain.TrTrainingProjectApproval;
import com.ruoyi.system.service.ITrTrainingProjectApprovalService;

/**
 * 项目审批Service业务层处理
 * 
 * @author bigluobo
 * @date 2023-05-12
 */
@Service
public class TrTrainingProjectApprovalServiceImpl implements ITrTrainingProjectApprovalService 
{
    @Autowired
    private TrTrainingProjectApprovalMapper trTrainingProjectApprovalMapper;

    /**
     * 查询项目审批
     * 
     * @param id 项目审批主键
     * @return 项目审批
     */
    @Override
    public TrTrainingProjectApproval selectTrTrainingProjectApprovalById(Long id)
    {
        return trTrainingProjectApprovalMapper.selectTrTrainingProjectApprovalById(id);
    }

    /**
     * 查询项目审批列表
     * 
     * @param trTrainingProjectApproval 项目审批
     * @return 项目审批
     */
    @Override
    public List<TrTrainingProjectApproval> selectTrTrainingProjectApprovalList(TrTrainingProjectApproval trTrainingProjectApproval)
    {
        return trTrainingProjectApprovalMapper.selectTrTrainingProjectApprovalList(trTrainingProjectApproval);
    }

    /**
     * 新增项目审批
     * 
     * @param trTrainingProjectApproval 项目审批
     * @return 结果
     */
    @Override
    public int insertTrTrainingProjectApproval(TrTrainingProjectApproval trTrainingProjectApproval)
    {
        return trTrainingProjectApprovalMapper.insertTrTrainingProjectApproval(trTrainingProjectApproval);
    }

    /**
     * 修改项目审批
     * 
     * @param trTrainingProjectApproval 项目审批
     * @return 结果
     */
    @Override
    public int updateTrTrainingProjectApproval(TrTrainingProjectApproval trTrainingProjectApproval)
    {
        return trTrainingProjectApprovalMapper.updateTrTrainingProjectApproval(trTrainingProjectApproval);
    }

    /**
     * 批量删除项目审批
     * 
     * @param ids 需要删除的项目审批主键
     * @return 结果
     */
    @Override
    public int deleteTrTrainingProjectApprovalByIds(Long[] ids)
    {
        return trTrainingProjectApprovalMapper.deleteTrTrainingProjectApprovalByIds(ids);
    }

    /**
     * 删除项目审批信息
     * 
     * @param id 项目审批主键
     * @return 结果
     */
    @Override
    public int deleteTrTrainingProjectApprovalById(Long id)
    {
        return trTrainingProjectApprovalMapper.deleteTrTrainingProjectApprovalById(id);
    }
}
