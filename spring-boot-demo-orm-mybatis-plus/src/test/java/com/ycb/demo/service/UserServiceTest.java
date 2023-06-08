package com.ycb.demo.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ycb.demo.SpringBootDemoOrmMybatisPlusApplication;
import com.ycb.demo.SpringBootDemoOrmMybatisPlusApplicationTests;
import com.ycb.demo.bean.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author 袁存波
 * @version 1.0
 * @create 2023-06-07 22:37
 * User Service 测试
 */
public class UserServiceTest extends SpringBootDemoOrmMybatisPlusApplicationTests {
    @Autowired
    UserService userService;

    /**
     * 测试Mybatis-Plus 新增
     */
    @Test
    public void testList(){
        List<User> list = userService.list(new QueryWrapper<>());
        for (User user : list) {
            System.out.println(user);
        }
    }
}
