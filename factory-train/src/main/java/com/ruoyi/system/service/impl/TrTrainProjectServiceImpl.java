package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TrTrainProjectMapper;
import com.ruoyi.system.domain.TrTrainProject;
import com.ruoyi.system.service.ITrTrainProjectService;

/**
 * 项目清单Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-22
 */
@Service
public class TrTrainProjectServiceImpl implements ITrTrainProjectService 
{
    @Autowired
    private TrTrainProjectMapper trTrainProjectMapper;

    /**
     * 查询项目清单
     * 
     * @param id 项目清单主键
     * @return 项目清单
     */
    @Override
    public TrTrainProject selectTrTrainProjectById(Long id)
    {
        return trTrainProjectMapper.selectTrTrainProjectById(id);
    }

    /**
     * 查询项目清单列表
     * 
     * @param trTrainProject 项目清单
     * @return 项目清单
     */
    @Override
    public List<TrTrainProject> selectTrTrainProjectList(TrTrainProject trTrainProject)
    {
        return trTrainProjectMapper.selectTrTrainProjectList(trTrainProject);
    }

    /**
     * 新增项目清单
     * 
     * @param trTrainProject 项目清单
     * @return 结果
     */
    @Override
    public int insertTrTrainProject(TrTrainProject trTrainProject)
    {
        return trTrainProjectMapper.insertTrTrainProject(trTrainProject);
    }

    /**
     * 修改项目清单
     * 
     * @param trTrainProject 项目清单
     * @return 结果
     */
    @Override
    public int updateTrTrainProject(TrTrainProject trTrainProject)
    {
        return trTrainProjectMapper.updateTrTrainProject(trTrainProject);
    }

    /**
     * 批量删除项目清单
     * 
     * @param ids 需要删除的项目清单主键
     * @return 结果
     */
    @Override
    public int deleteTrTrainProjectByIds(Long[] ids)
    {
        return trTrainProjectMapper.deleteTrTrainProjectByIds(ids);
    }

    /**
     * 删除项目清单信息
     * 
     * @param id 项目清单主键
     * @return 结果
     */
    @Override
    public int deleteTrTrainProjectById(Long id)
    {
        return trTrainProjectMapper.deleteTrTrainProjectById(id);
    }
}
