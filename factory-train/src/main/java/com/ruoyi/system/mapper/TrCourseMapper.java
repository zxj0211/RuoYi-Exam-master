package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.TrCourse;

/**
 * 课程信息Mapper接口
 * 
 * @author bigluobo
 * @date 2023-05-12
 */
public interface TrCourseMapper 
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
     * 删除课程信息
     * 
     * @param courseId 课程信息主键
     * @return 结果
     */
    public int deleteTrCourseByCourseId(Long courseId);

    /**
     * 批量删除课程信息
     * 
     * @param courseIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTrCourseByCourseIds(Long[] courseIds);
}
