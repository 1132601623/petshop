package com.xcy.petshop.service.impl;

import com.xcy.petshop.mapper.SelectPetMapper;
import com.xcy.petshop.pojo.Pet;
import com.xcy.petshop.service.SelectPetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SelectPetServiceImpl implements SelectPetService {
  @Autowired SelectPetMapper selectPetMapper;

  @Override
  public List<Pet> selectAllPetById(int id) {
    List<Pet> cats = selectPetMapper.selectAllPetById(id);
    return cats;
  }
}
