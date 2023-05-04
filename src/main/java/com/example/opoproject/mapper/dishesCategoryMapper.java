package com.example.opoproject.mapper;

import com.example.opoproject.pojo.dishesCategory;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

//@Mapper
public interface dishesCategoryMapper {
    /**
     *新增一个dishesCategory
     * @param dishesCategory
     * @return
     */
    public  int saveDishesCategory(dishesCategory dishesCategory);

    /**
     * 删除一个或者批量删除dishesCategory
     * @param dishesCategoryIds
     * @return
     */
    public int deleteDishesCategoryOrDishesCategorys(List<Long> dishesCategoryIds);

    /**
     * 修改一个DishesCategory的信息
     * @param dishesCategory
     * @return
     */
    public int updateDishesCategory(dishesCategory dishesCategory);

    /**
     * 根据id查询dishesCategory
     * @param id
     * @return
     */
    public dishesCategory getDishesCategoryByid(@Param("id") Long id);

    /**
     *
     * @param dishesCategoryName
     * @return
     */
    public List<dishesCategory> getAllDishesCategorys(@Param("dishesCategoryName") String dishesCategoryName);
}
