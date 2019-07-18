package com.xcy.petshop.service.impl;

import com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase;
import com.xcy.petshop.mapper.UserMapper;
import com.xcy.petshop.pojo.User;
import com.xcy.petshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper mapper;

    @Override
    public boolean selectByEmail(String email) {
        int count = mapper.selectByEmail(email);
        if(count > 0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void registerEmail(User user) {
        mapper.registerEmail(user);
    }
}
