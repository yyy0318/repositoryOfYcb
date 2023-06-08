package com.ycb.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 袁存波
 * @version 1.0
 * @create 2023-06-03 17:12
 */
@RestController
public class IndexController {
    @GetMapping(value = {"/",""})
    public String index(){
        return "This is a Spring Boot Admin Client";
    }
}
