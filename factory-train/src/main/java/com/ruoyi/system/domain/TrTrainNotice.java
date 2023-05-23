package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 tr_train_notice
 *
 * @author ruoyi
 * @date 2023-05-19
 */
public class TrTrainNotice extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 标题 */
    @Excel(name = "标题")
    private String name;

    /** 内容 */
    @Excel(name = "内容")
    private String content;

    /** 发布时间 */
    @Excel(name = "发布时间")
    private String time;

    /** 发布人 */
    @Excel(name = "发布人")
    private String user;

    /** 封面 */
    @Excel(name = "封面")
    private String img;

    /** 1-简单的公告，2富文本 */
    @Excel(name = "1-简单的公告，2富文本")
    private Long type;

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
    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }
    public void setTime(String time)
    {
        this.time = time;
    }

    public String getTime()
    {
        return time;
    }
    public void setUser(String user)
    {
        this.user = user;
    }

    public String getUser()
    {
        return user;
    }
    public void setImg(String img)
    {
        this.img = img;
    }

    public String getImg()
    {
        return img;
    }
    public void setType(Long type)
    {
        this.type = type;
    }

    public Long getType()
    {
        return type;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("content", getContent())
            .append("time", getTime())
            .append("user", getUser())
            .append("img", getImg())
            .append("type", getType())
            .toString();
    }
}
