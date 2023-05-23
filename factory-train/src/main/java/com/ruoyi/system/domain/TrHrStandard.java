package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 企业人力资源管理标准管理对象 tr_hr_standard
 * 
 * @author ruoyi
 * @date 2023-05-12
 */
public class TrHrStandard extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 标准ID */
    private Long standardId;

    /** 标准名称 */
    @Excel(name = "标准名称")
    private String standardName;

    /** 标准描述 */
    @Excel(name = "标准描述")
    private String standardDescription;

    /** 文件存储路径url */
    @Excel(name = "文件存储路径url")
    private String fileUrl;

    public void setStandardId(Long standardId) 
    {
        this.standardId = standardId;
    }

    public Long getStandardId() 
    {
        return standardId;
    }
    public void setStandardName(String standardName) 
    {
        this.standardName = standardName;
    }

    public String getStandardName() 
    {
        return standardName;
    }
    public void setStandardDescription(String standardDescription) 
    {
        this.standardDescription = standardDescription;
    }

    public String getStandardDescription() 
    {
        return standardDescription;
    }
    public void setFileUrl(String fileUrl) 
    {
        this.fileUrl = fileUrl;
    }

    public String getFileUrl() 
    {
        return fileUrl;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("standardId", getStandardId())
            .append("standardName", getStandardName())
            .append("standardDescription", getStandardDescription())
            .append("fileUrl", getFileUrl())
            .toString();
    }
}
