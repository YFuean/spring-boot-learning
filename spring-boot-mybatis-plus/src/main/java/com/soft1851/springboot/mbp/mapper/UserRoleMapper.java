package com.soft1851.springboot.mbp.mapper;

import com.soft1851.springboot.mbp.model.UserRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.soft1851.springboot.mbp.model.UserVo;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yue_fan
 * @since 2020-04-16
 */
public interface UserRoleMapper extends BaseMapper<UserRole> {
    /**
     * 根据用户id查询该用户角色
     * @param userId
     * @return
     */
    List<UserVo> getUserRole(String userId);
}
