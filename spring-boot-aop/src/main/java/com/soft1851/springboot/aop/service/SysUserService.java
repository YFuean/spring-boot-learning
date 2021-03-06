package com.soft1851.springboot.aop.service;

import java.util.List;
import java.util.Map;

/**
 * (SysUser)表服务接口
 */
public interface SysUserService {

    /**
     * 用户登录
     * @param id
     * @param password
     * @return
     */
    Map<String, Object> signIn(String id, String password);
}