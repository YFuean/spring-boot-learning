package com.soft1851.springboot.mbp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Follower
 * @Description TODO
 * @Author yue_fan
 * @Date 2020/4/16
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Follower {
    private Integer id;
    private String name;
    private String url;
    private String gender;
    private String avatarUrl;
    private Integer followerCount;
}
