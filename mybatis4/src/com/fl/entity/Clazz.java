package com.fl.entity;

import java.io.Serializable;
import java.util.List;

public class Clazz implements Serializable {
    private int clazzno;
    private String cname;
    private List<Student>students;
    public Clazz(){};
    public Clazz(int clazzno, String cname) {
        this.clazzno = clazzno;
        this.cname = cname;
    }

    public Clazz(int clazzno, String cname, List<Student> students) {
        this.clazzno = clazzno;
        this.cname = cname;
        this.students = students;
    }

    public int getClazzno() {
        return clazzno;
    }

    public void setClazzno(int clazzno) {
        this.clazzno = clazzno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "clazzno=" + clazzno +
                ", cname='" + cname + '\'' +
                ", students=" + students +
                '}';
    }
}
