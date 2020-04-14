package com.soft1851.springboot.aop.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SysPermissionMapperTest {
    @Resource
    private SysPermissionMapper sysPermissionMapper;


    @Test
    void getPermissionById() {
        System.out.println(sysPermissionMapper.getPermissionById(1));
    }

    @Test
    void getChildById() {
        System.out.println(sysPermissionMapper.getChildById(2));
    }

    @Test
    void getChildByParentId() {
        System.out.println(sysPermissionMapper.getChildByParentId(5));
    }

    @Test
    void getParentPermission() {
        System.out.println(sysPermissionMapper.getParentPermission());
    }
}