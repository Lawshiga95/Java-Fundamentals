package com.lawshiga.accessmodifier;


import java.time.LocalDate;

public class PrivateClassExample {

    public String name;
    public int age;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getBornYear(int age) {
        LocalDate localDate = LocalDate.now();
        int year = localDate.getYear();
        return (year - age);
    }
}
