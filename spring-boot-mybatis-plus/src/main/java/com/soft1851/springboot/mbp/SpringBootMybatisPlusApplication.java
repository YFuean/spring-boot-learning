package com.soft1851.springboot.mbp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author yuefan
 */
@SpringBootApplication
@MapperScan("com.soft1851.springboot.mbp.mapper")
@ComponentScan("com.soft1851.springboot.mbp.service")
@ComponentScan("com.soft1851.springboot.mbp.controller")
public class SpringBootMybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisPlusApplication.class, args);
    }

}
