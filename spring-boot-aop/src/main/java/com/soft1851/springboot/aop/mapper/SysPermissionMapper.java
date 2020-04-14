package com.soft1851.springboot.aop.mapper;

import com.soft1851.springboot.aop.entity.SysPermission;
import org.apache.ibatis.annotations.*;

import java.security.Permission;
import java.util.List;
import java.util.Map;

/**
 * @Description TODO
 * @Author yue_fan
 * @Date 2020/4/13
 * @Version 1.0
 */
public interface SysPermissionMapper {

    /**
     * 根据资源id查询
     * @param id
     * @return
     */
    @Select("SELECT * FROM sys_permission WHERE id=#{id}")
    SysPermission getPermissionById(int id);

    /**
     * 根据资源id查询资源及子类资源
     * @param id
     * @return
     */
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "subList", column = "id",
                    many=@Many(select="com.soft1851.springboot.aop.mapper.SysPermissionMapper.getChildByParentId")),
    })
    @Select("SELECT * FROM sys_permission WHERE id=#{id}")
    Map<String, Object> getChildById(int id);

    /**
     * 根据父类id查询子类资源
     * @param parentId
     * @return
     */
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "subList", column = "id",
                    one=@One(select="com.soft1851.springboot.aop.mapper.SysPermissionMapper.getChildByParentId")),
    })
    @Select("SELECT * FROM sys_permission WHERE parent_id=#{parentId}")
    List<Map<String, Object>> getChildByParentId(int parentId);

    /**
     * 获取页面级别资源及其所拥有的子类资源
     * @return
     */
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "subList", column = "id",
                    many=@Many(select="com.soft1851.springboot.aop.mapper.SysPermissionMapper.getChildByParentId")),
    })
    @Select("SELECT * FROM sys_permission WHERE parent_id = 0")
    List<Map<String, Object>> getParentPermission();
}
