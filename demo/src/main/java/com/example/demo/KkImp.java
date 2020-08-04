package com.example.demo;


import org.apache.dubbo.config.annotation.Service;

@Service
public class KkImp implements Kk{
    @Override
    public String show() {
        return "bbbb";
    }
}
