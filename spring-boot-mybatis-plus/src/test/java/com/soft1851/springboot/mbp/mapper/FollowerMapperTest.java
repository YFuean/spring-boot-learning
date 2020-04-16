package com.soft1851.springboot.mbp.mapper;

import com.soft1851.springboot.mbp.entity.Follower;
import org.apache.catalina.LifecycleState;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.lang.annotation.Target;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class FollowerMapperTest {

    @Resource
    private FollowerMapper followerMapper;

    @Test
    void testSelectAll(){
        List<Follower> followers = followerMapper.selectList(null);
        assertEquals(2999,followers.size());
    }

}