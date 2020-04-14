package com.soft1851.springboot.aop.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName UserRole
 * @Description TODO
 * @Author yue_fan
 * @Date 2020/4/14
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRole {
    private Integer id;
    private String userId;
    private Integer roleId;
}
