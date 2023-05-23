package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TrCourseMapper;
import com.ruoyi.system.domain.TrCourse;
import com.ruoyi.system.service.ITrCourseService;

/**
 * 课程信息Service业务层处理
 * 
 * @author bigluobo
 * @date 2023-05-12
 */
@Service
public class TrCourseServiceImpl implements ITrCourseService 
{
    @Autowired
    private TrCourseMapper trCourseMapper;

    /**
     * 查询课程信息
     * 
     * @param courseId 课程信息主键
     * @return 课程信息
     */
    @Override
    public TrCourse selectTrCourseByCourseId(Long courseId)
    {
        return trCourseMapper.selectTrCourseByCourseId(courseId);
    }

    /**
     * 查询课程信息列表
     * 
     * @param trCourse 课程信息
     * @return 课程信息
     */
    @Override
    public List<TrCourse> selectTrCourseList(TrCourse trCourse)
    {
        return trCourseMapper.selectTrCourseList(trCourse);
    }

    /**
     * 新增课程信息
     * 
     * @param trCourse 课程信息
     * @return 结果
     */
    @Override
    public int insertTrCourse(TrCourse trCourse)
    {
        trCourse.setCreateTime(DateUtils.getNowDate());
        return trCourseMapper.insertTrCourse(trCourse);
    }

    /**
     * 修改课程信息
     * 
     * @param trCourse 课程信息
     * @return 结果
     */
    @Override
    public int updateTrCourse(TrCourse trCourse)
    {
        trCourse.setUpdateTime(DateUtils.getNowDate());
        return trCourseMapper.updateTrCourse(trCourse);
    }

    /**
     * 批量删除课程信息
     * 
     * @param courseIds 需要删除的课程信息主键
     * @return 结果
     */
    @Override
    public int deleteTrCourseByCourseIds(Long[] courseIds)
    {
        return trCourseMapper.deleteTrCourseByCourseIds(courseIds);
    }

    /**
     * 删除课程信息信息
     * 
     * @param courseId 课程信息主键
     * @return 结果
     */
    @Override
    public int deleteTrCourseByCourseId(Long courseId)
    {
        return trCourseMapper.deleteTrCourseByCourseId(courseId);
    }
}
