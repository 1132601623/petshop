package com.xcy.petshop.mapper;

import com.xcy.petshop.pojo.Pet;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PetMapper {
  List<Pet> selectAllNearPets(Pet pet);
}
