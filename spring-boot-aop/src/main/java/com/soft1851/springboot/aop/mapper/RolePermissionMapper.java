package com.soft1851.springboot.aop.mapper;

import com.soft1851.springboot.aop.entity.RolePermission;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * @Description TODO
 * @Author yue_fan
 * @Date 2020/4/13
 * @Version 1.0
 */
public interface RolePermissionMapper {

    /**
     * 根据角色id查询角色
     * @param roleId
     * @return
     */
    @Results({
            @Result(property = "permission", column = "permission_id",
                    one=@One(select="com.soft1851.springboot.aop.mapper.SysPermissionMapper.getChildById")),
    })
    @Select("SELECT * FROM role_permission WHERE role_id=#{roleId}")
    List<Map<String, Object>> getRolePermissionByRoleId(int roleId);
}
