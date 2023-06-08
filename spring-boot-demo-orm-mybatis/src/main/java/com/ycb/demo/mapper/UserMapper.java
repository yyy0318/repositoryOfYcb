package com.ycb.demo.mapper;

import com.ycb.demo.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 袁存波
 * @version 1.0
 * @create 2023-06-07 17:12
 */
@Mapper
@Component
public interface UserMapper {
    /**
     * 查询所有用户
     * @return 返回用户列表
     */
    @Select("select * from user")
    List<User> selectAllUser();

    /**
     * 根据id查询用户
     * @param id
     * @return 当前id的用户，不存在则是null
     */
    @Select("select * from user where id = #{id}}")
    User selectUserById(@Param("id") Long id);

    /**
     * 保存用户
     * @param user
     * @return
     */
    int saveUser(@Param("user") User user);

    /**
     * 根据id删除用户
     * @param id
     * @return
     */
    int deleteById(@Param("id")Long id);
}
