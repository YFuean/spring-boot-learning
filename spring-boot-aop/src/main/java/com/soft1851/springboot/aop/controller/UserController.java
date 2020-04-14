package com.soft1851.springboot.aop.controller;

import com.soft1851.springboot.aop.annotation.AuthToken;
import com.soft1851.springboot.aop.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.security.PublicKey;
import java.util.Map;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author yue_fan
 * @Date 2020/4/13
 **/
@RestController
@Slf4j
@RequestMapping(value = "/user")
public class UserController {
    @Resource
    private SysUserService sysUserService;

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
     * @param
     * @return
     */
    @GetMapping("/login")
    public Map<String,Object> sign(@Param("id") String id,@Param("password") String password){
        return sysUserService.signIn(id,password);
    }
}
