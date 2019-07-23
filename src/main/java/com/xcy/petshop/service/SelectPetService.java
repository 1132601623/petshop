package com.xcy.petshop.service;

import com.xcy.petshop.pojo.Pet;

import java.util.List;

public interface SelectPetService {

  List<Pet> selectAllPetById(int id);
}
