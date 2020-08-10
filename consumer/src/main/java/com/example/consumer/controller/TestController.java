package com.example.consumer.controller;

import com.example.consumer.service.OrderManageImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    OrderManageImp orderManageImp;
    @GetMapping("/test/{order_id}")
    public Boolean ss(@PathVariable(name = "order_id") Integer id){

        boolean r = orderManageImp.doInMapper(id);
        return r;
    }
}
