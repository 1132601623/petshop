package com.xcy.petshop.service.impl;

import com.xcy.petshop.mapper.CatMapper;
import com.xcy.petshop.pojo.Pet;
import com.xcy.petshop.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatServiceImpl implements CatService {
  @Autowired CatMapper catMapper;

  @Override
  public List<Pet> selectAllCats(String name) {
    return catMapper.selectAllCats(name);
  }

  @Override
  public Pet getCatById(int id) {
    return catMapper.getCatById(id);
  }
}
