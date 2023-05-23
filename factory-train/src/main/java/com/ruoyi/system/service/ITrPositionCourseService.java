package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.TrPositionCourse;

/**
 * 岗位课程Service接口
 * 
 * @author bigluobo
 * @date 2023-05-12
 */
public interface ITrPositionCourseService 
{
    /**
     * 查询岗位课程
     * 
     * @param id 岗位课程主键
     * @return 岗位课程
     */
    public TrPositionCourse selectTrPositionCourseById(Long id);

    /**
     * 查询岗位课程列表
     * 
     * @param trPositionCourse 岗位课程
     * @return 岗位课程集合
     */
    public List<TrPositionCourse> selectTrPositionCourseList(TrPositionCourse trPositionCourse);

    /**
     * 新增岗位课程
     * 
     * @param trPositionCourse 岗位课程
     * @return 结果
     */
    public int insertTrPositionCourse(TrPositionCourse trPositionCourse);

    /**
     * 修改岗位课程
     * 
     * @param trPositionCourse 岗位课程
     * @return 结果
     */
    public int updateTrPositionCourse(TrPositionCourse trPositionCourse);

    /**
     * 批量删除岗位课程
     * 
     * @param ids 需要删除的岗位课程主键集合
     * @return 结果
     */
    public int deleteTrPositionCourseByIds(Long[] ids);

    /**
     * 删除岗位课程信息
     * 
     * @param id 岗位课程主键
     * @return 结果
     */
    public int deleteTrPositionCourseById(Long id);
}
