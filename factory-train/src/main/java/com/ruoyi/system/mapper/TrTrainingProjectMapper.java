package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.TrTrainingProject;

/**
 * 培训项目Mapper接口
 * 
 * @author bigluobo
 * @date 2023-05-12
 */
public interface TrTrainingProjectMapper 
{
    /**
     * 查询培训项目
     * 
     * @param id 培训项目主键
     * @return 培训项目
     */
    public TrTrainingProject selectTrTrainingProjectById(Long id);

    /**
     * 查询培训项目列表
     * 
     * @param trTrainingProject 培训项目
     * @return 培训项目集合
     */
    public List<TrTrainingProject> selectTrTrainingProjectList(TrTrainingProject trTrainingProject);

    /**
     * 新增培训项目
     * 
     * @param trTrainingProject 培训项目
     * @return 结果
     */
    public int insertTrTrainingProject(TrTrainingProject trTrainingProject);

    /**
     * 修改培训项目
     * 
     * @param trTrainingProject 培训项目
     * @return 结果
     */
    public int updateTrTrainingProject(TrTrainingProject trTrainingProject);

    /**
     * 删除培训项目
     * 
     * @param id 培训项目主键
     * @return 结果
     */
    public int deleteTrTrainingProjectById(Long id);

    /**
     * 批量删除培训项目
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTrTrainingProjectByIds(Long[] ids);
}
