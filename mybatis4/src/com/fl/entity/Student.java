package com.fl.entity;

import java.io.Serializable;

public class Student implements Serializable {
    private int sid;
    private String name;
    private int clazzno;
    private Clazz clazz;
    public Student(){};
    public Student(int sid, String name, int clazzno) {
        this.sid = sid;
        this.name = name;
        this.clazzno = clazzno;
    }

    public Student(int sid, String name, int clazzno, Clazz clazz) {
        this.sid = sid;
        this.name = name;
        this.clazzno = clazzno;
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", clazzno=" + clazzno +
                ", clazz=" + clazz +
                '}';
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClazzno() {
        return clazzno;
    }

    public void setClazzno(int clazzno) {
        this.clazzno = clazzno;
    }


}
