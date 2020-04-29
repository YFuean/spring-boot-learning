package com.soft1851.springboot.mbp.mapper;

import com.soft1851.springboot.mbp.SpringBootMybatisPlusApplication;
import com.soft1851.springboot.mbp.model.UserRole;
import com.soft1851.springboot.mbp.model.UserVo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(classes = SpringBootMybatisPlusApplication.class)
class UserRoleMapperTest {
    @Resource
    private UserRoleMapper mapper;
    @Test
    void getUserRole() {
        List<UserVo> userRoleMappers = mapper.getUserRole("1802343337");
        userRoleMappers.forEach(System.out::println);
    }
}