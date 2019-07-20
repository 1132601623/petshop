package com.xcy.petshop.controller;

import com.xcy.petshop.pojo.Pet;
import com.xcy.petshop.service.CatService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/cat")
public class CatController {
  @Autowired CatService catService;
    //agc
  @RequestMapping("list")
  @ApiOperation("拿到所有的猫猫，如果有其它值，那么就是模糊查询")
  public List<Pet> showCatList(
      @ApiParam("根据猫的姓名，进行模糊查询") String name, HttpServletResponse response) {
    response.setHeader("Access-Control-Allow-Origin", "*");
    List<Pet> catList = catService.selectAllCats(name);
    return catList;
  }
}
