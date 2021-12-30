package com.xiaobai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 终于白发始于青丝
 * @create 2021-12-30 下午 21:53
 * @program ssm
 * @Version 1.0
 * @ClassName TestController
 */
@Controller
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "success";
    }

}
