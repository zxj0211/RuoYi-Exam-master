package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TrTeacherMapper;
import com.ruoyi.system.domain.TrTeacher;
import com.ruoyi.system.service.ITrTeacherService;

/**
 * 师资Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-12
 */
@Service
public class TrTeacherServiceImpl implements ITrTeacherService 
{
    @Autowired
    private TrTeacherMapper trTeacherMapper;

    /**
     * 查询师资
     * 
     * @param teacherId 师资主键
     * @return 师资
     */
    @Override
    public TrTeacher selectTrTeacherByTeacherId(Long teacherId)
    {
        return trTeacherMapper.selectTrTeacherByTeacherId(teacherId);
    }

    /**
     * 查询师资列表
     * 
     * @param trTeacher 师资
     * @return 师资
     */
    @Override
    public List<TrTeacher> selectTrTeacherList(TrTeacher trTeacher)
    {
        return trTeacherMapper.selectTrTeacherList(trTeacher);
    }

    /**
     * 新增师资
     * 
     * @param trTeacher 师资
     * @return 结果
     */
    @Override
    public int insertTrTeacher(TrTeacher trTeacher)
    {
        return trTeacherMapper.insertTrTeacher(trTeacher);
    }

    /**
     * 修改师资
     * 
     * @param trTeacher 师资
     * @return 结果
     */
    @Override
    public int updateTrTeacher(TrTeacher trTeacher)
    {
        return trTeacherMapper.updateTrTeacher(trTeacher);
    }

    /**
     * 批量删除师资
     * 
     * @param teacherIds 需要删除的师资主键
     * @return 结果
     */
    @Override
    public int deleteTrTeacherByTeacherIds(Long[] teacherIds)
    {
        return trTeacherMapper.deleteTrTeacherByTeacherIds(teacherIds);
    }

    /**
     * 删除师资信息
     * 
     * @param teacherId 师资主键
     * @return 结果
     */
    @Override
    public int deleteTrTeacherByTeacherId(Long teacherId)
    {
        return trTeacherMapper.deleteTrTeacherByTeacherId(teacherId);
    }
}
