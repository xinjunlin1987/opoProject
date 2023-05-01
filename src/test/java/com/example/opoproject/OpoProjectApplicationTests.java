package com.example.opoproject;

import com.example.opoproject.mapper.dishesCategoryMapper;
import com.example.opoproject.pojo.dishesCategory;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class OpoProjectApplicationTests {
    @Resource
    dishesCategoryMapper dishesCategoryMapper;
    @Resource
    dishesCategory dishesCategory;
    @Test
    void insertdishesCategory(){
        dishesCategory dishesCategory = new dishesCategory();
        dishesCategory.setDishesCategoryDescription("666");
        dishesCategory.setDishesCategoryStatus(true);
        dishesCategory.setDishesCategoryName("帅比");
        dishesCategoryMapper.saveDishesCategory(dishesCategory);
    }
    @Test
    void deleteDishesCategoryOrDishesCategorys(){
        ArrayList<Long> longs = new ArrayList<>();
        for(long i=1;i<=10;i++){
            longs.add(i);
        }
        dishesCategoryMapper.deleteDishesCategoryOrDishesCategorys(longs);
    }
    @Test
    void updateDishesCategory(){
        dishesCategory dishesCategory = new dishesCategory();
        dishesCategory.setDishesCategoryId(1L);
        dishesCategory.setDishesCategoryStatus(true);
        dishesCategory.setDishesCategoryName("sdad");
        dishesCategory.setDishesCategoryDescription("asadada");
        dishesCategoryMapper.updateDishesCategory(dishesCategory);
    }
    @Test
    void getDishesCategoryByid(){
        dishesCategory dishesCategoryByid = dishesCategoryMapper.getDishesCategoryByid(1L);
        System.out.println(dishesCategoryByid.toString());
    }
    @Test
    void getAllDishescategory(){
        PageHelper.startPage(1,3);
        List<dishesCategory> list = dishesCategoryMapper.getAllDishesCategorys();
        PageInfo<dishesCategory> info = new PageInfo<>(list);
        System.out.println(info);
    }
    @Test
    void test(){
        System.out.println(dishesCategory.toString());
    }
}
