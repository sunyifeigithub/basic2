package com.example.consumer.service;

import com.example.consumer.dao.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
@Component
public class OrderManageImp {
@Autowired
    OrderMapper orderMapper;
    public boolean doInMapper(Integer order_id){
        orderMapper.In(order_id);
        return true;
    }
}
