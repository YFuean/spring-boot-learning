package com.soft1851.springboot.aop.annotation;

import java.lang.annotation.*;

/**
 * @ClassName ControllerWebLog
 * @Description 自定义web日志注解
 * @Author yue_fan
 * @Date 2020/4/9
 **/
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ControllerWebLog {
    //调用的接口名称
    String name();
    //该日志是否需要持久化
    boolean isSaved() default false;
}
