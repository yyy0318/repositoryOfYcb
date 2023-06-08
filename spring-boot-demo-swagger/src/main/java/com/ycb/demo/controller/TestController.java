package com.ycb.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 袁存波
 * @version 1.0
 * @create 2023-06-08 17:58
 */
@RestController
public class TestController {
    @GetMapping("/")
    public String toHello(){
        return "hello";
    }
}
