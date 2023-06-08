package com.ycb.demo.controller;

import com.ycb.demo.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Objects;

/**
 * @author 袁存波
 * @version 1.0
 * @create 2023-06-05 17:05
 */
@Controller
public class IndexController {
    @GetMapping(value = {"","/"})
    public ModelAndView index(HttpServletRequest httpServletRequest){
        ModelAndView modelAndView = new ModelAndView();
        HttpSession session = httpServletRequest.getSession();
        User user = (User) session.getAttribute("user");
        if (Objects.isNull(user)){
            modelAndView.setViewName("redirect:/user/login");
        } else{
            modelAndView.setViewName("/page/index");
            modelAndView.addObject(user);
        }
        return modelAndView;
    }
}
