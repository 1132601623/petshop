package com.xcy.petshop.mapper;

import com.xcy.petshop.pojo.Cat;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CatMapper {
  List<Cat> selectAllCats(String name);
}
