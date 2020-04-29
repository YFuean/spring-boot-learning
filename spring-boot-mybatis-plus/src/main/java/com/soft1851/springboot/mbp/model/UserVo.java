package com.soft1851.springboot.mbp.model;

import lombok.*;
import lombok.experimental.Accessors;

/**
 * @ClassName UserVo
 * @Description TODO
 * @Author yue_fan
 * @Date 2020/4/16
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UserVo {
    private String userId;
    private Integer roleId;
    private String userName;
    private String roleName;
    private String description;
}
