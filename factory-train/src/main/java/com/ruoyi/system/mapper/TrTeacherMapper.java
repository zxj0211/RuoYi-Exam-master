package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.TrTeacher;

/**
 * 师资Mapper接口
 * 
 * @author ruoyi
 * @date 2023-05-12
 */
public interface TrTeacherMapper 
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
     * 删除师资
     * 
     * @param teacherId 师资主键
     * @return 结果
     */
    public int deleteTrTeacherByTeacherId(Long teacherId);

    /**
     * 批量删除师资
     * 
     * @param teacherIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTrTeacherByTeacherIds(Long[] teacherIds);
}
