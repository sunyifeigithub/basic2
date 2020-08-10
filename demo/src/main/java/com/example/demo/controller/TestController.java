package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductManageImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController {
    @Autowired
    ProductManageImp productManageImp;
    @GetMapping("/test")
    public Boolean ss(){
        boolean r = productManageImp.getUpMapper();
        return r;
    }
}
