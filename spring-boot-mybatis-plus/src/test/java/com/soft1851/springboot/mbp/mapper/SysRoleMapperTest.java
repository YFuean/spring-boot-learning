package com.soft1851.springboot.mbp.mapper;

import com.soft1851.springboot.mbp.SpringBootMybatisPlusApplication;
import com.soft1851.springboot.mbp.model.SysRole;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(classes = SpringBootMybatisPlusApplication.class)
class SysRoleMapperTest {
    @Resource
    private SysRoleMapper sysRoleMapper;

    @Test
    void testSelectAll(){
        List<SysRole> sysRoles = sysRoleMapper.selectList(null);
        sysRoles.forEach(System.out::println);
    }

}