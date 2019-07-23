package com.xcy.petshop.mapper;

import com.xcy.petshop.pojo.Pet;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DogMapper {
  List<Pet> selectAllDogs(String name);

  Pet getDogById(int id);

    Pet getPetById(int id);
}
