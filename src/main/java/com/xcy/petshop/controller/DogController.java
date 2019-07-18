package com.xcy.petshop.controller;

import com.xcy.petshop.pojo.Dog;
import com.xcy.petshop.service.DogService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dog")
public class DogController {
  @Autowired DogService dogService;

  @RequestMapping("/list")
  @ApiOperation("拿到所有的狗狗")
  public List<Dog> showDogList(@ApiParam("根据姓名，进行模糊查询") String name) {
    List<Dog> dogList = dogService.selectAllDogs(name);
    return dogList;
  }
}
