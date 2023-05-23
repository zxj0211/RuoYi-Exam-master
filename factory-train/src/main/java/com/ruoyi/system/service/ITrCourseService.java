package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.TrCourse;

/**
 * 课程信息Service接口
 * 
 * @author bigluobo
 * @date 2023-05-12
 */
public interface ITrCourseService 
{
    /**
     * 查询课程信息
     * 
     * @param courseId 课程信息主键
     * @return 课程信息
     */
    public TrCourse selectTrCourseByCourseId(Long courseId);

    /**
     * 查询课程信息列表
     * 
     * @param trCourse 课程信息
     * @return 课程信息集合
     */
    public List<TrCourse> selectTrCourseList(TrCourse trCourse);

    /**
     * 新增课程信息
     * 
     * @param trCourse 课程信息
     * @return 结果
     */
    public int insertTrCourse(TrCourse trCourse);

    /**
     * 修改课程信息
     * 
     * @param trCourse 课程信息
     * @return 结果
     */
    public int updateTrCourse(TrCourse trCourse);

    /**
     * 批量删除课程信息
     * 
     * @param courseIds 需要删除的课程信息主键集合
     * @return 结果
     */
    public int deleteTrCourseByCourseIds(Long[] courseIds);

    /**
     * 删除课程信息信息
     * 
     * @param courseId 课程信息主键
     * @return 结果
     */
    public int deleteTrCourseByCourseId(Long courseId);
}
