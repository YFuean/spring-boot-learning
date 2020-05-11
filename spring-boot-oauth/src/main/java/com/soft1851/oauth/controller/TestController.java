package com.soft1851.oauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author yue_fan
 * @Date 2020/4/29
 **/
@Controller
public class TestController {
    @RequestMapping("/index")
    public String simpleIndex(){
        return "index";
    }
}
