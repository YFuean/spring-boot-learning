package com.soft1851.springboot.aop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName RolePermission
 * @Description TODO
 * @Author yue_fan
 * @Date 2020/4/14
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RolePermission {
    private Integer id;
    private Integer roleId;
    private Integer permission;
}
