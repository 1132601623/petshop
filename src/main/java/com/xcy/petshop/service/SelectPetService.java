package com.xcy.petshop.service;


import com.xcy.petshop.pojo.Pet;

import java.util.List;

public interface SelectPetService {
    List<Pet> selectAllCatById(int id) ;

    List<Pet> selectAllDogById(int id) ;
}
