package com.example.opoproject.serviceImpl;

import com.example.opoproject.Util.resultUtil;
import com.example.opoproject.mapper.dishesCategoryMapper;
import com.example.opoproject.pojo.dishesCategory;
import com.example.opoproject.service.dishesCategoryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;
@Service
public class dishesCategoryServiceImpl implements dishesCategoryService {
    @Resource
    dishesCategoryMapper dishesCategoryMapper;
    @Override
    public resultUtil saveDishesCategory(dishesCategory dishesCategory) {
        Integer i = dishesCategoryMapper.saveDishesCategory(dishesCategory);
        if(i>0) return  resultUtil.getOK();
        else return  resultUtil.getErro();
    }

    @Override
    public resultUtil deleteDishesCategoryOrDishesCategorys(List<Long> dishesCategoryIds) {
        int i = dishesCategoryMapper.deleteDishesCategoryOrDishesCategorys(dishesCategoryIds);
        if(i>0) return  resultUtil.getOK();
        else return  resultUtil.getErro();
    }

    @Override
    public resultUtil updateDishesCategory(dishesCategory dishesCategory) {
        int i = dishesCategoryMapper.updateDishesCategory(dishesCategory);
        if(i>0) return  resultUtil.getOK();
        else return  resultUtil.getErro();
    }

    @Override
    public resultUtil<dishesCategory> getDishesCategoryByid(Long id) {
        dishesCategory dishesCategory = dishesCategoryMapper.getDishesCategoryByid(id);
        if(StringUtils.isEmpty(dishesCategory)) return new resultUtil<>(400,"没有这个菜品类别",null);
        return new resultUtil(dishesCategory);
    }

    @Override
    public resultUtil<PageInfo<dishesCategory>> getDishesCategorysBylimt(int pageNum,int pageSize,String dishesCategoryName) {
        PageHelper.startPage(pageNum,pageSize);
        List<dishesCategory> allDishesCategorys = dishesCategoryMapper.getAllDishesCategorys(dishesCategoryName);
        PageInfo<dishesCategory> pageInfo = new PageInfo<>(allDishesCategorys);
        if (StringUtils.isEmpty(allDishesCategorys)) {
            return  new resultUtil<>(500,"没有数据",null);
        }
        return new resultUtil<PageInfo<dishesCategory>>(pageInfo);
    }
}
