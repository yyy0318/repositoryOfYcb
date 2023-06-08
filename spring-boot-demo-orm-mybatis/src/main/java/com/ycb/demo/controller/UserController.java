package com.ycb.demo.controller;

import com.ycb.demo.bean.User;
import com.ycb.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 袁存波
 * @version 1.0
 * @create 2023-06-07 19:00
 */
@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/")
    public String insert(){
        User user = new User();
        user.setId((long)1);
        user.setName("你好");
        user.setPassword("ti");
        user.setSalt("田");
        user.setEmail("ming");
        user.setPhoneNumber("123456");
        user.setStatus(1);
        //时间转化为标准格式
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        user.setCreateTime(format);
        user.setLastLoginTime(format);
        user.setLastUpdateTime(format);
        if(userMapper.saveUser(user)!=0){
            return "插入成功";
        }else{
            return "插入失败";
        }
    }
}
