package com.ruoyi.web.controller.tiktok;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessStatus;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.McnGames;
import com.ruoyi.system.service.IMcnGamesService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/game/index")
public class GameController extends BaseController {

    private String prefix = "/tiktok/game";

    @Autowired
    private IMcnGamesService mcnGamesService;

    @RequiresPermissions("tiktok:game:view")
    @GetMapping()
    public String index() {
        return this.prefix + "/index";
    }

    @RequiresPermissions("tiktok:game:list")
    @RequestMapping("/list")
    @ResponseBody
    public TableDataInfo list(McnGames mcnGames) {
        startPage();
        List<McnGames> list = mcnGamesService.selectMcnGamesList(mcnGames);
        return getDataTable(list);
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap) {
        McnGames mcnGames = mcnGamesService.selectMcnGamesById(id);
        mmap.put("mcnGames", mcnGames);
        return this.prefix + "/edit";
    }

    @RequiresPermissions("tiktok:game:edit")
    @Log(title = "更新游戏信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(McnGames mcnGames){
        return toAjax(mcnGamesService.updateMcnGames(mcnGames));
    }

    @RequiresPermissions("tiktok:game:remove")
    @Log(title = "删除游戏", businessType = BusinessType.DELETE)
    @PostMapping("remove")
    @ResponseBody
    public AjaxResult remove(String ids){
        return toAjax(mcnGamesService.deleteMcnGamesByIds(ids));
    }

    @GetMapping("/add")
    public String add()
    {
        return this.prefix + "/add";
    }

    @RequiresPermissions("tiktok:game:add")
    @Log(title = "新增游戏", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(McnGames mcnGames)
    {
        return toAjax(mcnGamesService.insertMcnGames(mcnGames));
    }
}
