package com.fl.mapper;

import com.fl.entity.Flower;

import java.util.List;

public interface FlowerMapper {
    List<Flower> selectMore(String name,String production);
    List<Flower> selectMore2(String name,String production);

    List<Flower> selectMore3(String name);
    List<Flower> selectMore4(String name,String production);

    int update(Flower flower);
    int update2(Flower flower);
}
