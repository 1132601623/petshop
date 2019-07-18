package com.xcy.petshop.controller;

import com.xcy.petshop.pojo.User;
import com.xcy.petshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/User")
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping("/validateEmail")
    @ResponseBody
    public String validateEmail(String email){
        boolean count = userService.selectByEmail(email);
        if(count){
            return "success";
        }else{
            return "fail";
        }
    }

    @RequestMapping("/registerEmail")
    public String registerEmail(User user){
        userService.registerEmail(user);
        return null;
    }
}
