package com.ycb.demo.dao;

import com.ycb.demo.bean.User;
import com.ycb.demo.dao.base.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 袁存波
 * @version 1.0
 * @create 2023-06-06 15:30
 */
@Component
public class UserDao implements BaseDao<User> {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Integer insert(User user) {
        //id,name password,salt,email,phoneNumber,status,createTime,lastLoginTime,lastUpdateTime
        Long id = user.getId();
        String name = user.getName();
        String password = user.getPassword();
        String salt = user.getSalt();
        String email = user.getEmail();
        String phoneNumber = user.getPhoneNumber();
        Integer status = user.getStatus();
        //创建时时间都一样
        String createTime = user.getCreateTime();
        String lastLoginTime = user.getLastLoginTime();
        String lastUpdateTime = user.getLastUpdateTime();
        String sql = String.format("insert into user values (%d,'%s','%s','%s','%s','%s',%d,'%s','%s','%s')"
                ,id,name,password,salt,email,phoneNumber,status,createTime,lastLoginTime,lastUpdateTime);
        System.out.println(sql);
        return jdbcTemplate.update(sql);
    }

    @Override
    public Integer deleteById() {
        return null;
    }

    @Override
    public Integer updateById() {
        return null;
    }

    @Override
    public User serachOneById() {
        return null;
    }

    @Override
    public List<User> serachManyById() {
        return null;
    }
}
