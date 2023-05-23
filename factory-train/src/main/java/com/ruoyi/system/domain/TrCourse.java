package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 课程信息对象 tr_course
 * 
 * @author bigluobo
 * @date 2023-05-12
 */
public class TrCourse extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 课程ID */
    private Long courseId;

    /** 课程名称 */
    @Excel(name = "课程名称")
    private String courseName;

    /** 显示顺序 */
    @Excel(name = "显示顺序")
    private Long courseSort;

    /** 课程详情 */
    @Excel(name = "课程详情")
    private String courseInfo;

    /** 课程状态（0正常 1停用） */
    @Excel(name = "课程状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 课程材料 */
    @Excel(name = "课程材料")
    private String courseMaterials;

    /** 课程练习材料 */
    @Excel(name = "课程练习材料")
    private String courseExercises;

    /** 课程考试 */
    @Excel(name = "课程考试")
    private String coursePapers;

    public void setCourseId(Long courseId) 
    {
        this.courseId = courseId;
    }

    public Long getCourseId() 
    {
        return courseId;
    }
    public void setCourseName(String courseName) 
    {
        this.courseName = courseName;
    }

    public String getCourseName() 
    {
        return courseName;
    }
    public void setCourseSort(Long courseSort) 
    {
        this.courseSort = courseSort;
    }

    public Long getCourseSort() 
    {
        return courseSort;
    }
    public void setCourseInfo(String courseInfo) 
    {
        this.courseInfo = courseInfo;
    }

    public String getCourseInfo() 
    {
        return courseInfo;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }
    public void setStartTime(Date startTime) 
    {
        this.startTime = startTime;
    }

    public Date getStartTime() 
    {
        return startTime;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }
    public void setCourseMaterials(String courseMaterials) 
    {
        this.courseMaterials = courseMaterials;
    }

    public String getCourseMaterials() 
    {
        return courseMaterials;
    }
    public void setCourseExercises(String courseExercises) 
    {
        this.courseExercises = courseExercises;
    }

    public String getCourseExercises() 
    {
        return courseExercises;
    }
    public void setCoursePapers(String coursePapers) 
    {
        this.coursePapers = coursePapers;
    }

    public String getCoursePapers() 
    {
        return coursePapers;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("courseId", getCourseId())
            .append("courseName", getCourseName())
            .append("courseSort", getCourseSort())
            .append("courseInfo", getCourseInfo())
            .append("status", getStatus())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("courseMaterials", getCourseMaterials())
            .append("courseExercises", getCourseExercises())
            .append("coursePapers", getCoursePapers())
            .toString();
    }
}
