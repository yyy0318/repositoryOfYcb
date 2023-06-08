package com.ycb.demo.service;

import com.ycb.demo.bean.User;
import com.ycb.demo.dao.UserDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 袁存波
 * @version 1.0
 * @create 2023-06-06 15:44
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    //插入数据
    public Integer insert(){
        User user = new User();
        //id,name password,salt,email,phoneNumber,status,createTime,lastLoginTime,lastUpdateTime
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

        return userDao.insert(user);
    }
}
