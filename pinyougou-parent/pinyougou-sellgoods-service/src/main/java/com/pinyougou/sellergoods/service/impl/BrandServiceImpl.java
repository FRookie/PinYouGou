package com.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pinyougou.mapper.TbBrandMapper;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellgoods.service.BrandService;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private TbBrandMapper mapper;
    @Override
    public List<TbBrand> findAll() {
        return mapper.selectByExample(null);
    }

    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<TbBrand> tbBrands = (Page<TbBrand>) mapper.selectByExample(null);

        return new PageResult(tbBrands.getTotal(),tbBrands.getResult());
    }

    @Override
    public void addBrand(TbBrand tbBrand) {
        mapper.insert(tbBrand);
    }

    @Override
    public TbBrand findOne(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateBrand(TbBrand tbBrand) {
        mapper.updateByPrimaryKey(tbBrand);
    }


}
