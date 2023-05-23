package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TrPositionCourseMapper;
import com.ruoyi.system.domain.TrPositionCourse;
import com.ruoyi.system.service.ITrPositionCourseService;

/**
 * 岗位课程Service业务层处理
 * 
 * @author bigluobo
 * @date 2023-05-12
 */
@Service
public class TrPositionCourseServiceImpl implements ITrPositionCourseService 
{
    @Autowired
    private TrPositionCourseMapper trPositionCourseMapper;

    /**
     * 查询岗位课程
     * 
     * @param id 岗位课程主键
     * @return 岗位课程
     */
    @Override
    public TrPositionCourse selectTrPositionCourseById(Long id)
    {
        return trPositionCourseMapper.selectTrPositionCourseById(id);
    }

    /**
     * 查询岗位课程列表
     * 
     * @param trPositionCourse 岗位课程
     * @return 岗位课程
     */
    @Override
    public List<TrPositionCourse> selectTrPositionCourseList(TrPositionCourse trPositionCourse)
    {
        return trPositionCourseMapper.selectTrPositionCourseList(trPositionCourse);
    }

    /**
     * 新增岗位课程
     * 
     * @param trPositionCourse 岗位课程
     * @return 结果
     */
    @Override
    public int insertTrPositionCourse(TrPositionCourse trPositionCourse)
    {
        trPositionCourse.setCreateTime(DateUtils.getNowDate());
        return trPositionCourseMapper.insertTrPositionCourse(trPositionCourse);
    }

    /**
     * 修改岗位课程
     * 
     * @param trPositionCourse 岗位课程
     * @return 结果
     */
    @Override
    public int updateTrPositionCourse(TrPositionCourse trPositionCourse)
    {
        trPositionCourse.setUpdateTime(DateUtils.getNowDate());
        return trPositionCourseMapper.updateTrPositionCourse(trPositionCourse);
    }

    /**
     * 批量删除岗位课程
     * 
     * @param ids 需要删除的岗位课程主键
     * @return 结果
     */
    @Override
    public int deleteTrPositionCourseByIds(Long[] ids)
    {
        return trPositionCourseMapper.deleteTrPositionCourseByIds(ids);
    }

    /**
     * 删除岗位课程信息
     * 
     * @param id 岗位课程主键
     * @return 结果
     */
    @Override
    public int deleteTrPositionCourseById(Long id)
    {
        return trPositionCourseMapper.deleteTrPositionCourseById(id);
    }
}
