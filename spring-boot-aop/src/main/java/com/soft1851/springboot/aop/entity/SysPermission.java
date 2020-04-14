package com.soft1851.springboot.aop.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName SysPermission
 * @Description TODO
 * @Author yue_fan
 * @Date 2020/4/14
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SysPermission {
    private Integer id;
    private Integer parentId;
    private String name;
    private Integer type;
    private String icon;
    private String path;
    private String ex1;
    private Integer ex2;
}
