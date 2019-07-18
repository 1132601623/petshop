package com.xcy.petshop.controller;

import com.xcy.petshop.pojo.Cat;
import com.xcy.petshop.pojo.Dog;
import com.xcy.petshop.service.CatService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cat")
public class CatController {
    @Autowired
    CatService catService;
    @RequestMapping("list")
    public List<Cat> showCatList(@ApiParam("根据猫的姓名，进行模糊查询") String name){
        List<Cat> catList = catService.selectAllCats(name);
        return catList;
    }
}
