package com.example.admin.intentdemo;

/**
 * Created by Admin on 4/10/2018.
 */

public class Student {
    private int id;
    private String name;
    private String lop;

    public Student() {
    }

    public Student(int id, String name, String lop) {
        this.id = id;
        this.name = name;
        this.lop = lop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
}
