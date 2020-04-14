package com.soft1851.springboot.aop.service;

import com.soft1851.springboot.aop.mapper.RolePermissionMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class RolePermissionServiceTest {
    @Resource
    private RolePermissionService rolePermissionService;

    @Test
    void getSuperPermission() {
        System.out.println(rolePermissionService.getSuperPermission());
    }

    @Test
    void getPermissionByRole() {
        System.out.println(rolePermissionService.getPermissionByRole(2));
    }
}