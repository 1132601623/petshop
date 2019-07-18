package com.xcy.petshop.service.impl;

import com.xcy.petshop.mapper.DogMapper;
import com.xcy.petshop.pojo.Dog;
import com.xcy.petshop.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogServiceImpl implements DogService {
  @Autowired DogMapper dogMapper;

  @Override
  public List<Dog> selectAllDogs(String name) {
    return dogMapper.selectAllDogs(name);
  }
}
