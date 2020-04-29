package com.soft1851.springboot.mbp.mapper;

import com.soft1851.springboot.mbp.SpringBootMybatisPlusApplication;
import com.soft1851.springboot.mbp.model.SysUser;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

@SpringBootTest(classes = SpringBootMybatisPlusApplication.class)
class SysUserMapperTest {
    @Resource
    private SysUserMapper sysUserMapper;

    @Test
    void testSelectAll(){
        List<SysUser> sysUsers = sysUserMapper.selectList(null);
        sysUsers.forEach(System.out::println);
    }
}