package com.soft1851.springboot.aop.controller;

import com.soft1851.springboot.aop.annotation.AuthToken;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author yue_fan
 * @Date 2020/4/13
 **/
@RestController
@Slf4j
public class UserController {

    /**
     * 无需校验，不用注解
     * @param name
     * @return
     */
    @GetMapping("hello")
    public String hello(String name){
        log.info("hello()方法无需鉴权和认证，当前用户名:"+name);
        return "hello访问成功";
    }

    /**
     * 需要登录的校验,需要加注解，不用传角色
     * @param name
     * @return
     */
    @GetMapping("user")
    @AuthToken
    public String user(String name){
        log.info("user()方法需要认证，当前用户名："+name);
        return "user()方法访问成功";
    }

    /**需要登录的校验,需要加注解，需要传角色
     *
     * @param name
     * @return
     */
    @GetMapping("admin")
    @AuthToken(role_name = {"admin","Admin"})
    public String admin(String name){
        log.info("user()方法需要鉴权，当前用户名："+name);
        return "admin()方法访问成功";
    }
}
