package com.soft1851.springboot.aop.controller;

import com.soft1851.springboot.aop.annotation.AuthToken;
import com.soft1851.springboot.aop.common.Result;
import com.soft1851.springboot.aop.service.RolePermissionService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName RolePermissionController
 * @Description TODO
 * @Author yue_fan
 * @Date 2020/4/14
 **/
@RestController
@RequestMapping(value = "/role")
public class RolePermissionController {
    @Resource
    private RolePermissionService service;

    @GetMapping("/admin")
    @AuthToken(role_name = "超级管理员")
    public Result selectAll() {
        return Result.success(service.getSuperPermission());
    }

    @GetMapping("/ordinaryAdmin")
    @AuthToken(role_name = "普通管理员")
    public Result getBySysId(@Param("id") int id) {
        return Result.success(service.getPermissionByRole(id));
    }

}
