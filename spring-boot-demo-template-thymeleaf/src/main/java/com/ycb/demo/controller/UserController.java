package com.ycb.demo.controller;

import com.ycb.demo.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author 袁存波
 * @version 1.0
 * @create 2023-06-05 17:14
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @PostMapping("/login")
    public ModelAndView login(User user, HttpServletRequest request){
        //添加user对象进modelAndView，并跳转进首页
        ModelAndView modelAndView = new ModelAndView();
        System.out.println(user);
        modelAndView.addObject(user);
        //通过setViewName()方法跳转到指定的页面
        modelAndView.setViewName("redirect:/");

        HttpSession session = request.getSession();
        session.setAttribute("user",user);
        return modelAndView;
    }

    @GetMapping("/login")
    public ModelAndView login(){
        //ModelAndView构造方法可以指定返回的页面名称
        return new ModelAndView("page/login");
    }
}
