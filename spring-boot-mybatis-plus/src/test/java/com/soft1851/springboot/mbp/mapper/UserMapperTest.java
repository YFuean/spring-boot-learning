package com.soft1851.springboot.mbp.mapper;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.soft1851.springboot.mbp.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.xml.crypto.Data;

import java.util.Date;
import java.sql.Timestamp;
import java.util.List;

@SpringBootTest
class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Test
    void testSelectAll(){
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    @Test
    void testInsert(){
        User user = new User();
        user.setUserId("11111123555");
        user.setUserName("测试1");
        user.setPassword("111");
        user.setCreateTime(new Timestamp(new Date().getTime()));

        userMapper.insert(user);
    }

    @Test
    void testDelete(){
        System.out.println(userMapper.deleteById(111111));
    }

}