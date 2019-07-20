package com.xcy.petshop.mapper;

import com.xcy.petshop.pojo.Cat;
import com.xcy.petshop.pojo.Dog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface SelectPetMapper {
    List<Cat> selectAllCatById(int id);

    List<Dog> selectAllDogById(int id);
}
