package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.McnGamesMapper;
import com.ruoyi.system.domain.McnGames;
import com.ruoyi.system.service.IMcnGamesService;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-11-11
 */
@Service
public class McnGamesServiceImpl implements IMcnGamesService 
{
    @Autowired
    private McnGamesMapper mcnGamesMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public McnGames selectMcnGamesById(Integer id)
    {
        return mcnGamesMapper.selectMcnGamesById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param mcnGames 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<McnGames> selectMcnGamesList(McnGames mcnGames)
    {
        return mcnGamesMapper.selectMcnGamesList(mcnGames);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param mcnGames 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertMcnGames(McnGames mcnGames)
    {
        return mcnGamesMapper.insertMcnGames(mcnGames);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param mcnGames 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateMcnGames(McnGames mcnGames)
    {
        return mcnGamesMapper.updateMcnGames(mcnGames);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteMcnGamesByIds(String ids)
    {
        return mcnGamesMapper.deleteMcnGamesByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteMcnGamesById(Integer id)
    {
        return mcnGamesMapper.deleteMcnGamesById(id);
    }
}
