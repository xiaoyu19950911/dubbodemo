package com.xiaoyu.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hero.fitness.utils.Result;
import com.hero.fitness.utils.ResultUtils;
import com.xiaoyu.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: dubbodemo
 * @description:
 * @author: XiaoYu
 * @create: 2018-05-31 16:26
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;

    @GetMapping("/getUser")
    public Result getUser(){
        return ResultUtils.success(userService.getUserById(1));
    }

}
