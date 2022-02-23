package com.fl.mapper;

import com.fl.entity.Flower;

import java.util.List;

public interface FlowerMapper2 {
    List<Flower> selectMore(List<Integer> list);
    List<Flower> selectMore2(String name,String production);
    List<Flower> selectMore3(List<String> list);
}
