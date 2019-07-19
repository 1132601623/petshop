package com.xcy.petshop.controller;

import com.xcy.petshop.pojo.User;
import com.xcy.petshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping("/validateEmail")
    @ResponseBody
    public String validateEmail(String email){
        boolean count = userService.selectByEmail(email);
        System.out.println(email);
        if(count){
            return "success";
        }else{
            return "fail";
        }
    }

    @RequestMapping("/registerEmail")
    public String registerEmail(User user){
        System.out.println(user);
        userService.registerEmail(user);

        return null;
    }

    @RequestMapping("/login")
    @ResponseBody
    public String login(User user){
        boolean resoult = userService.isLogin(user);
        if(resoult){
            return "success";
        }else{
            return "fail";
        }
    }

}
