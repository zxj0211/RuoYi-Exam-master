package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TrHrStandardMapper;
import com.ruoyi.system.domain.TrHrStandard;
import com.ruoyi.system.service.ITrHrStandardService;

/**
 * 企业人力资源管理标准管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-12
 */
@Service
public class TrHrStandardServiceImpl implements ITrHrStandardService 
{
    @Autowired
    private TrHrStandardMapper trHrStandardMapper;

    /**
     * 查询企业人力资源管理标准管理
     * 
     * @param standardId 企业人力资源管理标准管理主键
     * @return 企业人力资源管理标准管理
     */
    @Override
    public TrHrStandard selectTrHrStandardByStandardId(Long standardId)
    {
        return trHrStandardMapper.selectTrHrStandardByStandardId(standardId);
    }

    /**
     * 查询企业人力资源管理标准管理列表
     * 
     * @param trHrStandard 企业人力资源管理标准管理
     * @return 企业人力资源管理标准管理
     */
    @Override
    public List<TrHrStandard> selectTrHrStandardList(TrHrStandard trHrStandard)
    {
        return trHrStandardMapper.selectTrHrStandardList(trHrStandard);
    }

    /**
     * 新增企业人力资源管理标准管理
     * 
     * @param trHrStandard 企业人力资源管理标准管理
     * @return 结果
     */
    @Override
    public int insertTrHrStandard(TrHrStandard trHrStandard)
    {
        return trHrStandardMapper.insertTrHrStandard(trHrStandard);
    }

    /**
     * 修改企业人力资源管理标准管理
     * 
     * @param trHrStandard 企业人力资源管理标准管理
     * @return 结果
     */
    @Override
    public int updateTrHrStandard(TrHrStandard trHrStandard)
    {
        return trHrStandardMapper.updateTrHrStandard(trHrStandard);
    }

    /**
     * 批量删除企业人力资源管理标准管理
     * 
     * @param standardIds 需要删除的企业人力资源管理标准管理主键
     * @return 结果
     */
    @Override
    public int deleteTrHrStandardByStandardIds(Long[] standardIds)
    {
        return trHrStandardMapper.deleteTrHrStandardByStandardIds(standardIds);
    }

    /**
     * 删除企业人力资源管理标准管理信息
     * 
     * @param standardId 企业人力资源管理标准管理主键
     * @return 结果
     */
    @Override
    public int deleteTrHrStandardByStandardId(Long standardId)
    {
        return trHrStandardMapper.deleteTrHrStandardByStandardId(standardId);
    }
}
