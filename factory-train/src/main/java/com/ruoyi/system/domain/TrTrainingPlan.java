package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 培训计划对象 tr_train_plan
 *
 * @author ruoyi
 * @date 2023-05-12
 */
public class TrTrainingPlan extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 培训项目 */
    @Excel(name = "培训项目")
    private String project;

    /** 培训目的 */
    @Excel(name = "培训目的")
    private String purpose;

    /** 培训日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "培训日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date date;

    /** 地点 */
    @Excel(name = "地点")
    private String location;

    /** 讲师 */
    @Excel(name = "讲师")
    private String trainer;

    /** 培训对象 */
    @Excel(name = "培训对象")
    private String target;

    /** 考核方式 */
    @Excel(name = "考核方式")
    private String assessment;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setProject(String project)
    {
        this.project = project;
    }

    public String getProject()
    {
        return project;
    }
    public void setPurpose(String purpose)
    {
        this.purpose = purpose;
    }

    public String getPurpose()
    {
        return purpose;
    }
    public void setDate(Date date)
    {
        this.date = date;
    }

    public Date getDate()
    {
        return date;
    }
    public void setLocation(String location)
    {
        this.location = location;
    }

    public String getLocation()
    {
        return location;
    }
    public void setTrainer(String trainer)
    {
        this.trainer = trainer;
    }

    public String getTrainer()
    {
        return trainer;
    }
    public void setTarget(String target)
    {
        this.target = target;
    }

    public String getTarget()
    {
        return target;
    }
    public void setAssessment(String assessment)
    {
        this.assessment = assessment;
    }

    public String getAssessment()
    {
        return assessment;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("project", getProject())
            .append("purpose", getPurpose())
            .append("date", getDate())
            .append("location", getLocation())
            .append("trainer", getTrainer())
            .append("target", getTarget())
            .append("assessment", getAssessment())
            .append("remark", getRemark())
            .toString();
    }
}
