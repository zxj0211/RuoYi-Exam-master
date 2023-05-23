package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 题库管理对象 tr_question_banks
 * 
 * @author bigluobo
 * @date 2023-05-21
 */
public class TrQuestionBanks extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 考题类型 */
    @Excel(name = "考题类型")
    private Long questionType;

    /** 针对岗位 */
    @Excel(name = "针对岗位")
    private Long subjectrId;

    /** 本题分数 */
    @Excel(name = "本题分数")
    private Long score;

    /** 所属等级 */
    @Excel(name = "所属等级")
    private Long gradeLevel;

    /** 难度 */
    @Excel(name = "难度")
    private Long difficult;

    /** 正确答案 */
    @Excel(name = "正确答案")
    private String correct;

    /**  */
    @Excel(name = "")
    private Long infoTextrContentrId;

    /** 创建人 */
    @Excel(name = "创建人")
    private Long createUser;

    /**  */
    @Excel(name = "")
    private Long status;

    /**  */
    @Excel(name = "")
    private Integer deleted;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setQuestionType(Long questionType) 
    {
        this.questionType = questionType;
    }

    public Long getQuestionType() 
    {
        return questionType;
    }
    public void setSubjectrId(Long subjectrId) 
    {
        this.subjectrId = subjectrId;
    }

    public Long getSubjectrId() 
    {
        return subjectrId;
    }
    public void setScore(Long score) 
    {
        this.score = score;
    }

    public Long getScore() 
    {
        return score;
    }
    public void setGradeLevel(Long gradeLevel) 
    {
        this.gradeLevel = gradeLevel;
    }

    public Long getGradeLevel() 
    {
        return gradeLevel;
    }
    public void setDifficult(Long difficult) 
    {
        this.difficult = difficult;
    }

    public Long getDifficult() 
    {
        return difficult;
    }
    public void setCorrect(String correct) 
    {
        this.correct = correct;
    }

    public String getCorrect() 
    {
        return correct;
    }
    public void setInfoTextrContentrId(Long infoTextrContentrId) 
    {
        this.infoTextrContentrId = infoTextrContentrId;
    }

    public Long getInfoTextrContentrId() 
    {
        return infoTextrContentrId;
    }
    public void setCreateUser(Long createUser) 
    {
        this.createUser = createUser;
    }

    public Long getCreateUser() 
    {
        return createUser;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }
    public void setDeleted(Integer deleted) 
    {
        this.deleted = deleted;
    }

    public Integer getDeleted() 
    {
        return deleted;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("questionType", getQuestionType())
            .append("subjectrId", getSubjectrId())
            .append("score", getScore())
            .append("gradeLevel", getGradeLevel())
            .append("difficult", getDifficult())
            .append("correct", getCorrect())
            .append("infoTextrContentrId", getInfoTextrContentrId())
            .append("createUser", getCreateUser())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .append("deleted", getDeleted())
            .toString();
    }
}
