package com.soft1851.springboot.aop.annotation;

import java.lang.annotation.*;

/**
 * @ClassName AuthToken
 * @Description TODO
 * @Author yue_fan
 * @Date 2020/4/13
 **/
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AuthToken {
    /**
     * 访问接口所需要的角色，默认空，登录即可访问，可以定义多个
     * @return
     */
    String[] role_name() default "";
}
