package com.fl.mapper;

import com.fl.entity.Flower;
import java.util.List;

public interface FlowerMapper4 {
    public List<Flower> selectAll();
    public int insert(Flower flower);



    public Flower selectOne(int id , String name);
    public Flower selectOne2(Flower flower);
    public Flower selectOne3(Flower flower1,Flower flower2);
}
