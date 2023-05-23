package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 师资对象 tr_teacher
 * 
 * @author ruoyi
 * @date 2023-05-12
 */
public class TrTeacher extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 师资ID */
    private Long teacherId;

    /** 师资名称 */
    @Excel(name = "师资名称")
    private String teacherName;

    /** 师资描述 */
    @Excel(name = "师资描述")
    private String teacherDescription;

    /** 工作年限 */
    @Excel(name = "工作年限")
    private Long workYears;

    /** 电话 */
    @Excel(name = "电话")
    private String phone;

    /** 专业领域 */
    @Excel(name = "专业领域")
    private String majorField;

    /** 等级 */
    @Excel(name = "等级")
    private String level;

    /** 特点 */
    @Excel(name = "特点")
    private String features;

    public void setTeacherId(Long teacherId) 
    {
        this.teacherId = teacherId;
    }

    public Long getTeacherId() 
    {
        return teacherId;
    }
    public void setTeacherName(String teacherName) 
    {
        this.teacherName = teacherName;
    }

    public String getTeacherName() 
    {
        return teacherName;
    }
    public void setTeacherDescription(String teacherDescription) 
    {
        this.teacherDescription = teacherDescription;
    }

    public String getTeacherDescription() 
    {
        return teacherDescription;
    }
    public void setWorkYears(Long workYears) 
    {
        this.workYears = workYears;
    }

    public Long getWorkYears() 
    {
        return workYears;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setMajorField(String majorField) 
    {
        this.majorField = majorField;
    }

    public String getMajorField() 
    {
        return majorField;
    }
    public void setLevel(String level) 
    {
        this.level = level;
    }

    public String getLevel() 
    {
        return level;
    }
    public void setFeatures(String features) 
    {
        this.features = features;
    }

    public String getFeatures() 
    {
        return features;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("teacherId", getTeacherId())
            .append("teacherName", getTeacherName())
            .append("teacherDescription", getTeacherDescription())
            .append("workYears", getWorkYears())
            .append("phone", getPhone())
            .append("majorField", getMajorField())
            .append("level", getLevel())
            .append("features", getFeatures())
            .toString();
    }
}
