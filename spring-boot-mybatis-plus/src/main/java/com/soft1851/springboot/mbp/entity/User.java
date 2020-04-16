package com.soft1851.springboot.mbp.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * @ClassName User
 * @Description TODO
 * @Author yue_fan
 * @Date 2020/4/16
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
@TableName("sys_user")
public class User {
    private String userId;
    private String userName;
    private String password;
    private Timestamp createTime;
}
