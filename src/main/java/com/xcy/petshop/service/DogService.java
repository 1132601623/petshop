package com.xcy.petshop.service;

import com.xcy.petshop.pojo.Pet;

import java.util.List;

public interface DogService {
  List<Pet> selectAllDogs(String name);

  Pet getDogById(int id);

    Pet getPetById(int id);
}
