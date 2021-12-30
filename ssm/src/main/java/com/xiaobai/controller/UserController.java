package com.xiaobai.controller;

import com.xiaobai.pojo.User;
import com.xiaobai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 终于白发始于青丝
 * @create 2021-12-30 下午 22:49
 * @program ssm
 * @Version 1.0
 * @ClassName UserController
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findUserAll")
    @ResponseBody
    public List<User> findUserAll() {
        return userService.findUserAll();
    }

}
