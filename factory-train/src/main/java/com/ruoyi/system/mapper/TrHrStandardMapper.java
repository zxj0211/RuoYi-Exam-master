package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.TrHrStandard;

/**
 * 企业人力资源管理标准管理Mapper接口
 * 
 * @author ruoyi
 * @date 2023-05-12
 */
public interface TrHrStandardMapper 
{
    /**
     * 查询企业人力资源管理标准管理
     * 
     * @param standardId 企业人力资源管理标准管理主键
     * @return 企业人力资源管理标准管理
     */
    public TrHrStandard selectTrHrStandardByStandardId(Long standardId);

    /**
     * 查询企业人力资源管理标准管理列表
     * 
     * @param trHrStandard 企业人力资源管理标准管理
     * @return 企业人力资源管理标准管理集合
     */
    public List<TrHrStandard> selectTrHrStandardList(TrHrStandard trHrStandard);

    /**
     * 新增企业人力资源管理标准管理
     * 
     * @param trHrStandard 企业人力资源管理标准管理
     * @return 结果
     */
    public int insertTrHrStandard(TrHrStandard trHrStandard);

    /**
     * 修改企业人力资源管理标准管理
     * 
     * @param trHrStandard 企业人力资源管理标准管理
     * @return 结果
     */
    public int updateTrHrStandard(TrHrStandard trHrStandard);

    /**
     * 删除企业人力资源管理标准管理
     * 
     * @param standardId 企业人力资源管理标准管理主键
     * @return 结果
     */
    public int deleteTrHrStandardByStandardId(Long standardId);

    /**
     * 批量删除企业人力资源管理标准管理
     * 
     * @param standardIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTrHrStandardByStandardIds(Long[] standardIds);
}
