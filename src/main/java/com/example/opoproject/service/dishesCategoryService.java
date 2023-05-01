package com.example.opoproject.service;

import com.example.opoproject.Util.resultUtil;
import com.example.opoproject.pojo.dishesCategory;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public interface dishesCategoryService {
    /**
     * 保存一个dishesCategory
     * @param dishesCategory
     * @return
     */
    public resultUtil saveDishesCategory(dishesCategory dishesCategory);
    /**
     * 删除一个或者批量删除dishesCategory
     * @param dishesCategoryIds
     * @return
     */
    public resultUtil deleteDishesCategoryOrDishesCategorys(List<Long> dishesCategoryIds);
    /**
     * 修改一个DishesCategory的信息
     * @param dishesCategory
     * @return
     */
    public resultUtil updateDishesCategory(dishesCategory dishesCategory);

    /**
     * 根据id查询dishesCategory
     * @param id
     * @return
     */
    public resultUtil getDishesCategoryByid(@Param("id") Long id);

    /**
     * 获取所有的菜单信息
     * @return
     */
    public resultUtil getDishesCategorysBylimt(int pageNum,int pageSize);
}
