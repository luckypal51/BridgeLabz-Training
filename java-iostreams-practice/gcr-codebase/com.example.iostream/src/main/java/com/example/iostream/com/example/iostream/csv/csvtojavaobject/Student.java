package com.example.iostream.com.example.iostream.csv.csvtojavaobject;


public class Student {
    private int id;
    private String name;
    private String email;
    private String phone;

    public Student(int id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + email + ", " + phone;
    }
}
