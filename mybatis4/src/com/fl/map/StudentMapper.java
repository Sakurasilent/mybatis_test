package com.fl.map;

import com.fl.entity.Student;

import java.util.List;

public interface StudentMapper {

    List<Student> selectAll();

    List<Student> selectMore(int clazzno);
}
