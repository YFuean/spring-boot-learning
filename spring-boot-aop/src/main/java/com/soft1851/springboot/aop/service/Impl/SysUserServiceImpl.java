package com.soft1851.springboot.aop.service.Impl;

import com.soft1851.springboot.aop.entity.SysUser;
import com.soft1851.springboot.aop.mapper.SysUserMapper;
import com.soft1851.springboot.aop.mapper.UserRoleMapper;
import com.soft1851.springboot.aop.service.SysUserService;
import com.soft1851.springboot.aop.util.Md5Util;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description TODO
 * @Author yue_fan
 * @Date 2020/4/13
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserMapper mapper;
    @Resource
    private UserRoleMapper userRoleMapper;

    @Override
    public Map<String,Object> signIn(String id, String password) {
        SysUser user = mapper.signIn(id);
        Map<String,Object> map = new HashMap<>();
        String pass = Md5Util.getMD5(password, 32);
        if (user != null){
            if( user.getPassword().equals(pass)){
                map = userRoleMapper.getUserRole(id);
                if(map != null) {
                    return map;
                }
            }
            map.put("msg","密码有错误");
            return map;
        }
        map.put("msg", "账号错误");
        return map;
    }
}
