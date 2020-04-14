package com.soft1851.springboot.aop.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SysUserServiceTest {
    @Resource
    private SysUserService sysUserService;

    @Test
    void signIn() {
        System.out.println(sysUserService.signIn("1802343337","111111"));
    }
}