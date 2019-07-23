package com.xcy.petshop.service.impl;

import com.xcy.petshop.mapper.DogMapper;
import com.xcy.petshop.pojo.Pet;
import com.xcy.petshop.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogServiceImpl implements DogService {
  @Autowired DogMapper dogMapper;

  @Override
  public List<Pet> selectAllDogs(String name) {
    return dogMapper.selectAllDogs(name);
  }

  @Override
  public Pet getDogById(int id) {
    return dogMapper.getDogById(id);
  }

  @Override
  public Pet getPetById(int id) {

    return dogMapper.getPetById(id);
  }
}
