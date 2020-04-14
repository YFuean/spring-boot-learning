package com.soft1851.springboot.aop.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.Principal;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @ClassName User
 * @Description TODO
 * @Author yue_fan
 * @Date 2020/4/13
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SysUser {
    private String userId;
    private String userName;
    private String password;
    private LocalDateTime createTime;
}
