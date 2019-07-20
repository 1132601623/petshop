package com.xcy.petshop.service.impl;

import com.xcy.petshop.mapper.PetMapper;
import com.xcy.petshop.pojo.Pet;
import com.xcy.petshop.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetServiceImpl implements PetService {
  @Autowired PetMapper petMapper;

  @Override
  public List<Pet> selectAllNearPets(Pet pet) {
    return petMapper.selectAllNearPets(pet);
  }
}
