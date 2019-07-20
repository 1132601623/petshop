package com.xcy.petshop.mapper;

import com.xcy.petshop.pojo.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerMapper {

  List<Customer> selectAllDogDesc();

  List<Customer> selectAllCatDesc();

  List<Customer> selectAllDesc();
}
