package com.pinyougou.sellgoods.service;

import com.pinyougou.pojo.TbBrand;
import entity.PageResult;

import java.util.List;
/**
 * 品牌接口
 */
public interface BrandService {
    public List<TbBrand> findAll();

    public PageResult findPage(int pageNum, int pageSize);

    public void addBrand(TbBrand tbBrand);

    public TbBrand findOne(Long id);

    public void updateBrand(TbBrand tbBrand);
}
