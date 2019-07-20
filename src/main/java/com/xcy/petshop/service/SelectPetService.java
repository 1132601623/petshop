package com.xcy.petshop.service;

import com.xcy.petshop.pojo.Cat;
import com.xcy.petshop.pojo.Dog;

import java.util.List;

public interface SelectPetService {
    List<Cat> selectAllCatById(int id) ;

    List<Dog> selectAllDogById(int id) ;
}
