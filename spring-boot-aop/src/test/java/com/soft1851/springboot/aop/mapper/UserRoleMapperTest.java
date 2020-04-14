package com.soft1851.springboot.aop.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserRoleMapperTest {
    @Resource
    private UserRoleMapper userRoleMapper;

    @Test
    void getUserRole() {
        System.out.println(userRoleMapper.getUserRole("1802343333"));
    }
}