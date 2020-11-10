package com.ruoyi.app.controller.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.ruoyi.app.common.annotation.PassToken;
import com.ruoyi.app.common.base.BaseAppController;
import com.ruoyi.app.common.exception.UnauthorizedException;
import com.ruoyi.app.common.page.ResultData;
import com.ruoyi.app.common.util.JwtUtil;
import com.ruoyi.app.controller.sys.entity.AppUser;
import com.ruoyi.app.controller.sys.service.impl.UserService;

@Controller
@RequestMapping("login")
public class LoginController extends BaseAppController
{
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String login()
    {
       return  "index";
    }

    @GetMapping("/getUserId")
    public ResultData getUserId()
    {
        return ResultData.success(getCurrentUserId());
    }
}