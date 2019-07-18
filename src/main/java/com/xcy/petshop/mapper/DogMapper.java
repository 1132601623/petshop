package com.xcy.petshop.mapper;

import com.xcy.petshop.pojo.Dog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DogMapper {
  List<Dog> selectAllDogs(String name);
}
