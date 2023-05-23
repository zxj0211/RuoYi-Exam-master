package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.TrTeacher;

/**
 * 师资Service接口
 * 
 * @author ruoyi
 * @date 2023-05-12
 */
public interface ITrTeacherService 
{
    /**
     * 查询师资
     * 
     * @param teacherId 师资主键
     * @return 师资
     */
    public TrTeacher selectTrTeacherByTeacherId(Long teacherId);

    /**
     * 查询师资列表
     * 
     * @param trTeacher 师资
     * @return 师资集合
     */
    public List<TrTeacher> selectTrTeacherList(TrTeacher trTeacher);

    /**
     * 新增师资
     * 
     * @param trTeacher 师资
     * @return 结果
     */
    public int insertTrTeacher(TrTeacher trTeacher);

    /**
     * 修改师资
     * 
     * @param trTeacher 师资
     * @return 结果
     */
    public int updateTrTeacher(TrTeacher trTeacher);

    /**
     * 批量删除师资
     * 
     * @param teacherIds 需要删除的师资主键集合
     * @return 结果
     */
    public int deleteTrTeacherByTeacherIds(Long[] teacherIds);

    /**
     * 删除师资信息
     * 
     * @param teacherId 师资主键
     * @return 结果
     */
    public int deleteTrTeacherByTeacherId(Long teacherId);
}
