package com.example.demo.service;


import com.example.demo.service.Kk;
import org.apache.dubbo.config.annotation.Service;

@Service
public class KkImp implements Kk {
    @Override
    public String show() {
        return "bbbb";
    }
}
