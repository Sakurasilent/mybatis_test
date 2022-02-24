package com.fl.map;

import com.fl.entity.Clazz;

import java.util.List;

public interface ClazzMapper {
    Clazz selectOne(int clazzno);
    List<Clazz> selectAll();
}
