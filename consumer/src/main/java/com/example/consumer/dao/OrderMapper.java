package com.example.consumer.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
@Component
public interface OrderMapper {
    boolean In(Integer order_id);
}
