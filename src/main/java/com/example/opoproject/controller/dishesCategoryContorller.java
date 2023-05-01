package com.example.opoproject.controller;

import com.example.opoproject.Util.resultUtil;
import com.example.opoproject.pojo.dishesCategory;
import com.example.opoproject.service.dishesCategoryService;
import com.github.pagehelper.PageInfo;
import org.springframework.context.annotation.Lazy;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@Lazy
public class dishesCategoryContorller {
    @Resource
    dishesCategoryService dishesCategoryService;
    @PostMapping("/dishesCategory/add")
    public resultUtil saveDishesCategory(@RequestBody dishesCategory dishesCategory){
       return   dishesCategoryService.saveDishesCategory(dishesCategory);
    }
    @DeleteMapping("/dishesCategory/delectByIds")
    public resultUtil deleteDishesCategoryOrDishesCategorys(@RequestBody List<Long> dishesCategoryIds){
     return     dishesCategoryService.deleteDishesCategoryOrDishesCategorys(dishesCategoryIds);
    }
    @PutMapping("/dishesCategory/updateDishesCategory")
    public resultUtil updateDishesCategory(@RequestBody dishesCategory dishesCategory){
        return dishesCategoryService.updateDishesCategory(dishesCategory);
    }
        @GetMapping("/dishesCategory/getDishesCategoryById/{id}")
    public resultUtil<dishesCategory> getDishesCategoryByid(@PathVariable("id") Long id) {
      return    dishesCategoryService.getDishesCategoryByid(id);
    }
    @GetMapping("/dishesCategory/getDishesCategoryByLimit")
    public resultUtil<PageInfo<dishesCategory>>  getDishesCategorysBylimt(@RequestParam("pageNum") int pageNum,
                                                                          @RequestParam("pageSize") int pageSize){
        return dishesCategoryService.getDishesCategorysBylimt(pageNum,pageSize);
    }
}
