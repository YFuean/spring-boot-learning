package com.soft1851.springboot.aop.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.objenesis.instantiator.perc.PercInstantiator;

/**
 * @ClassName Role
 * @Description TODO
 * @Author yue_fan
 * @Date 2020/4/13
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SysRole {
    private Integer role_id;
    private String role_name;
    private String description;
}
