package com.fl.mapper;

import com.fl.entity.Flower;
import java.util.List;

public interface FlowerMapper4 {
    List<Flower> selectAll();
    int insert(Flower flower);
}
