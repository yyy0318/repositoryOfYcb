package com.ycb.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 袁存波
 * @version 1.0
 * @create 2023-06-07 21:40
 */
@SpringBootApplication
@MapperScan("com.ycb.demo.mapper")
public class SpringBootDemoOrmMybatisPlusApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoOrmMybatisPlusApplication.class,args);
    }
}
