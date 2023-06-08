package com.ycb.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ycb.demo.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author 袁存波
 * @version 1.0
 * @create 2023-06-07 22:24
 */
@Mapper
@Component
public interface UserMapper extends BaseMapper<User> {
}
