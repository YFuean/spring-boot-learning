package com.soft1851.springboot.aop.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SysUserMapperTest {
    @Resource
    private SysUserMapper sysUserMapper;

    @Test
    void getUserById() {
        System.out.println(sysUserMapper.getUserById("1802343337"));
    }

    @Test
    void signIn() {
        System.out.println(sysUserMapper.signIn("1802343337"));
    }
}