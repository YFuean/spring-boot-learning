package com.soft1851.springboot.aop.service.Impl;

import com.soft1851.springboot.aop.mapper.RolePermissionMapper;
import com.soft1851.springboot.aop.mapper.SysPermissionMapper;
import com.soft1851.springboot.aop.service.RolePermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Description TODO
 * @Author yue_fan
 * @Date 2020/4/13
 */
@Service
public class RolePermissionServiceImpl implements RolePermissionService {
    @Resource
    private RolePermissionMapper mapper;
    @Resource
    private SysPermissionMapper permissionMapper;

    @Override
    public List<Map<String, Object>> getSuperPermission() {
        return permissionMapper.getParentPermission();
    }

    @Override
    public List<Map<String, Object>> getPermissionByRole(int roleId) {
        return mapper.getRolePermissionByRoleId(roleId);
    }
}