package com.soft1851.springboot.aop.service;

import com.soft1851.springboot.aop.entity.RolePermission;
import java.util.List;
import java.util.Map;

/**
 * (RolePermission)表服务接口
 */
public interface RolePermissionService {

    /**
     * 查询超管权限
     * @return
     */
    List<Map<String, Object>> getSuperPermission();

    /**
     * 通过角色id查看权限（普通管理员）
     * @param roleId
     * @return
     */
    List<Map<String, Object>> getPermissionByRole(int roleId);
}