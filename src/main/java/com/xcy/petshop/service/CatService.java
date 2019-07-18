package com.xcy.petshop.service;

import com.xcy.petshop.pojo.Cat;

import java.util.List;

public interface CatService {
    List<Cat> selectAllCats(String name);
}
