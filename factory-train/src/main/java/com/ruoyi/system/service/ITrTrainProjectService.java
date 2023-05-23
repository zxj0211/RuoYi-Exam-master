package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.TrTrainProject;

/**
 * 项目清单Service接口
 * 
 * @author ruoyi
 * @date 2023-05-22
 */
public interface ITrTrainProjectService 
{
    /**
     * 查询项目清单
     * 
     * @param id 项目清单主键
     * @return 项目清单
     */
    public TrTrainProject selectTrTrainProjectById(Long id);

    /**
     * 查询项目清单列表
     * 
     * @param trTrainProject 项目清单
     * @return 项目清单集合
     */
    public List<TrTrainProject> selectTrTrainProjectList(TrTrainProject trTrainProject);

    /**
     * 新增项目清单
     * 
     * @param trTrainProject 项目清单
     * @return 结果
     */
    public int insertTrTrainProject(TrTrainProject trTrainProject);

    /**
     * 修改项目清单
     * 
     * @param trTrainProject 项目清单
     * @return 结果
     */
    public int updateTrTrainProject(TrTrainProject trTrainProject);

    /**
     * 批量删除项目清单
     * 
     * @param ids 需要删除的项目清单主键集合
     * @return 结果
     */
    public int deleteTrTrainProjectByIds(Long[] ids);

    /**
     * 删除项目清单信息
     * 
     * @param id 项目清单主键
     * @return 结果
     */
    public int deleteTrTrainProjectById(Long id);
}
