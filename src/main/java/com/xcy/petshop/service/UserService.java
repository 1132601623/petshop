package com.xcy.petshop.service;

import com.xcy.petshop.pojo.User;

public interface UserService {
    boolean selectByEmail(String email);

    void registerEmail(User user);

    boolean isLogin(User user);
}
