package com.ycb.demo.controller;

import com.ycb.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 袁存波
 * @version 1.0
 * @create 2023-06-06 21:19
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/insert")
    public String index(){
        if(userService.insert()!=0){
            return "插入成功";
        } else {
            return "插入失败";
        }
    }
}
