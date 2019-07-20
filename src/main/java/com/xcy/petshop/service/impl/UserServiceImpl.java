package com.xcy.petshop.service.impl;

import com.xcy.petshop.mapper.UserMapper;
import com.xcy.petshop.pojo.User;
import com.xcy.petshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired UserMapper userMapper;

  @Override
  public boolean selectByEmail(String email) {
    int count = userMapper.selectByEmail(email);
    if (count > 0) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public void registerEmail(User user) {
    userMapper.registerEmail(user);
  }

  @Override
  public boolean isLogin(User user) {
    int count = userMapper.isLogin(user);
    return count > 0 ? true : false;
  }

  @Override
  public void updateUserValidateCodeByEmail(User user) {
    userMapper.updateUserValidateCodeByEmail(user);
  }

  @Override
  public boolean validateEmailCode(User user) {
   int count = userMapper.validateEmailCode(user);
   if(count > 0){
     return true;
   }else {
     return false;
   }
  }

  @Override
  public void resetPassword(User user) {
    userMapper.resetPassword(user);
  }
}
