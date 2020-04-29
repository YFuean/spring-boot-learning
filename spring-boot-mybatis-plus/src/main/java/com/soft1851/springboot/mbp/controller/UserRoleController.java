package com.soft1851.springboot.mbp.controller;


import com.soft1851.springboot.mbp.mapper.UserRoleMapper;
import com.soft1851.springboot.mbp.model.UserRole;
import com.soft1851.springboot.mbp.model.UserVo;
import com.soft1851.springboot.mbp.service.UserRoleService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yue_fan
 * @since 2020-04-16
 */
@Controller
@RequestMapping("/userRole")
public class UserRoleController {
    @Resource
    private UserRoleMapper mapper;
    @GetMapping("/id")
    public List<UserVo> getUserRole(String userId){
        return mapper.getUserRole(userId);
    }

}
