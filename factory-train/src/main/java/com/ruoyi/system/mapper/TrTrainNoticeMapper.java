package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.TrTrainNotice;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author ruoyi
 * @date 2023-05-19
 */
public interface TrTrainNoticeMapper
{
    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public TrTrainNotice selectTrTrainNoticeById(Long id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param trTrainNotice 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<TrTrainNotice> selectTrTrainNoticeList(TrTrainNotice trTrainNotice);

    /**
     * 新增【请填写功能名称】
     *
     * @param trTrainNotice 【请填写功能名称】
     * @return 结果
     */
    public int insertTrTrainNotice(TrTrainNotice trTrainNotice);

    /**
     * 修改【请填写功能名称】
     *
     * @param trTrainNotice 【请填写功能名称】
     * @return 结果
     */
    public int updateTrTrainNotice(TrTrainNotice trTrainNotice);

    /**
     * 删除【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteTrTrainNoticeById(Long id);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTrTrainNoticeByIds(Long[] ids);
}
