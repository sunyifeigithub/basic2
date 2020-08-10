package com.example.demo.service;

import com.example.demo.dao.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
@Component
public class ProductManageImp implements ProductManage {
    @Autowired
    private ProductMapper productMapper;
    @Override
    public boolean getUpMapper() {
        System.out.println("jjj");
        productMapper.Up();
        return true;
    }
}
