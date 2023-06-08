package com.ycb.demo.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 袁存波
 * @version 1.0
 * @create 2023-06-05 22:47
 */
@Data
public class User implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 加密后的密码
     */
    private String password;

    /**
     * 加密使用的盐
     */
    private String salt;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号码
     */
    private String phoneNumber;

    /**
     * 状态，-1：逻辑删除，0：禁用，1：启用
     */
    private Integer status;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 上次登录时间
     */
    private String lastLoginTime;

    /**
     * 上次更新时间
     */
    private String lastUpdateTime;
}
