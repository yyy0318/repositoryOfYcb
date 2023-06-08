package com.ycb.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 袁存波
 * @version 1.0
 * @create 2023-06-07 11:10
 */
@SpringBootApplication
@MapperScan("com.ycb.demo.mapper")
public class SpringBootDemoOrmMybatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoOrmMybatisApplication.class,args);
    }
}
