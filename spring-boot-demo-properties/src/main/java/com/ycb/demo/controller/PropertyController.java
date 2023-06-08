package com.ycb.demo.controller;

import com.ycb.demo.property.ApplicationProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 袁存波
 * @version 1.0
 * @create 2023-06-03 11:58
 */
@RestController
public class PropertyController {
    @Autowired
    ApplicationProperty applicationProperty;

    @GetMapping("/index")
    public String index(){
        return applicationProperty.getName();
    }
}
