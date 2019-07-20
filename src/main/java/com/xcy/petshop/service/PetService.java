package com.xcy.petshop.service;

import com.xcy.petshop.pojo.Pet;

import java.util.List;

public interface PetService {
  List<Pet> selectAllNearPets(Pet pet);
}
