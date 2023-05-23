package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TrTrainingProjectMapper;
import com.ruoyi.system.domain.TrTrainingProject;
import com.ruoyi.system.service.ITrTrainingProjectService;

/**
 * 培训项目Service业务层处理
 * 
 * @author bigluobo
 * @date 2023-05-12
 */
@Service
public class TrTrainingProjectServiceImpl implements ITrTrainingProjectService 
{
    @Autowired
    private TrTrainingProjectMapper trTrainingProjectMapper;

    /**
     * 查询培训项目
     * 
     * @param id 培训项目主键
     * @return 培训项目
     */
    @Override
    public TrTrainingProject selectTrTrainingProjectById(Long id)
    {
        return trTrainingProjectMapper.selectTrTrainingProjectById(id);
    }

    /**
     * 查询培训项目列表
     * 
     * @param trTrainingProject 培训项目
     * @return 培训项目
     */
    @Override
    public List<TrTrainingProject> selectTrTrainingProjectList(TrTrainingProject trTrainingProject)
    {
        return trTrainingProjectMapper.selectTrTrainingProjectList(trTrainingProject);
    }

    /**
     * 新增培训项目
     * 
     * @param trTrainingProject 培训项目
     * @return 结果
     */
    @Override
    public int insertTrTrainingProject(TrTrainingProject trTrainingProject)
    {
        return trTrainingProjectMapper.insertTrTrainingProject(trTrainingProject);
    }

    /**
     * 修改培训项目
     * 
     * @param trTrainingProject 培训项目
     * @return 结果
     */
    @Override
    public int updateTrTrainingProject(TrTrainingProject trTrainingProject)
    {
        return trTrainingProjectMapper.updateTrTrainingProject(trTrainingProject);
    }

    /**
     * 批量删除培训项目
     * 
     * @param ids 需要删除的培训项目主键
     * @return 结果
     */
    @Override
    public int deleteTrTrainingProjectByIds(Long[] ids)
    {
        return trTrainingProjectMapper.deleteTrTrainingProjectByIds(ids);
    }

    /**
     * 删除培训项目信息
     * 
     * @param id 培训项目主键
     * @return 结果
     */
    @Override
    public int deleteTrTrainingProjectById(Long id)
    {
        return trTrainingProjectMapper.deleteTrTrainingProjectById(id);
    }
}
