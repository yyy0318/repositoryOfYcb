package com.ycb.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ycb.demo.bean.User;
import com.ycb.demo.mapper.UserMapper;
import com.ycb.demo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author 袁存波
 * @version 1.0
 * @create 2023-06-07 22:31
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
