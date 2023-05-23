package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 培训项目对象 tr_train_project_approval
 *
 * @author bigluobo
 * @date 2023-05-12
 */
public class TrTrainingProject extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 项目名称 */
    @Excel(name = "项目名称")
    private String name;

    /** 培训目的 */
    @Excel(name = "培训目的")
    private String purpose;

    /** 培训内容 */
    @Excel(name = "培训内容")
    private String content;

    /** 培训方式 */
    @Excel(name = "培训方式")
    private String method;

    /** 培训目标群体 */
    @Excel(name = "培训目标群体")
    private String targetGroup;

    /** 培训场所 */
    @Excel(name = "培训场所")
    private String location;

    /** 所需物资 */
    @Excel(name = "所需物资")
    private String materials;

    /** 培训级别 */
    @Excel(name = "培训级别")
    private String level;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setPurpose(String purpose)
    {
        this.purpose = purpose;
    }

    public String getPurpose()
    {
        return purpose;
    }
    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }
    public void setMethod(String method)
    {
        this.method = method;
    }

    public String getMethod()
    {
        return method;
    }
    public void setTargetGroup(String targetGroup)
    {
        this.targetGroup = targetGroup;
    }

    public String getTargetGroup()
    {
        return targetGroup;
    }
    public void setLocation(String location)
    {
        this.location = location;
    }

    public String getLocation()
    {
        return location;
    }
    public void setMaterials(String materials)
    {
        this.materials = materials;
    }

    public String getMaterials()
    {
        return materials;
    }
    public void setLevel(String level)
    {
        this.level = level;
    }

    public String getLevel()
    {
        return level;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("purpose", getPurpose())
            .append("content", getContent())
            .append("method", getMethod())
            .append("targetGroup", getTargetGroup())
            .append("location", getLocation())
            .append("materials", getMaterials())
            .append("level", getLevel())
            .toString();
    }
}
