package com.soft1851.springboot.aop.mapper;

import com.soft1851.springboot.aop.entity.UserRole;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

/**
 * @Description TODO
 * @Author yue_fan
 * @Date 2020/4/13
 */
public interface UserRoleMapper {

    /**
     * 根据用户id查询该用户角色
     * @param userId
     * @return
     */
    @Results({
            @Result(property = "role", column = "role_id",
                    one=@One(select="com.soft1851.springboot.aop.mapper.SysRoleMapper.getRoleById")),
            @Result(property = "user", column = "user_id",
                    one=@One(select="com.soft1851.springboot.aop.mapper.SysUserMapper.getUserById"))
    })
    @Select("SELECT * FROM user_role WHERE user_id=#{userId}")
    Map<String,Object> getUserRole(String userId);
}
