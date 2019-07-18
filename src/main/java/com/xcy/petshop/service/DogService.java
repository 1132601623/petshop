package com.xcy.petshop.service;

import com.xcy.petshop.pojo.Dog;

import java.util.List;

public interface DogService {
  List<Dog> selectAllDogs(String name);
}
