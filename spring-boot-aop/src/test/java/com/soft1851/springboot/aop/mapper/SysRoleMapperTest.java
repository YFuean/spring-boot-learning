package com.soft1851.springboot.aop.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SysRoleMapperTest {
    @Resource
    private SysRoleMapper sysRoleMapper;

    @Test
    void getRoleById() {
        System.out.println(sysRoleMapper.getRoleById(1));
    }
}