package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.McnGames;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2020-11-11
 */
public interface IMcnGamesService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public McnGames selectMcnGamesById(Integer id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param mcnGames 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<McnGames> selectMcnGamesList(McnGames mcnGames);

    /**
     * 新增【请填写功能名称】
     * 
     * @param mcnGames 【请填写功能名称】
     * @return 结果
     */
    public int insertMcnGames(McnGames mcnGames);

    /**
     * 修改【请填写功能名称】
     * 
     * @param mcnGames 【请填写功能名称】
     * @return 结果
     */
    public int updateMcnGames(McnGames mcnGames);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteMcnGamesByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteMcnGamesById(Integer id);
}
