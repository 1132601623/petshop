package com.xcy.petshop.service;

import com.xcy.petshop.pojo.Pet;

import java.util.List;

public interface CatService {
  List<Pet> selectAllCats(String name);

  Pet getCatById(int id);
}
