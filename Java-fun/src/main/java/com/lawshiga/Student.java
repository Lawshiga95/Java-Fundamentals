package com.lawshiga;

public class Student
{
    int rollNo;
    String className;
    String name;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public static void main(String args[])
    {
        final Student object = new Student();
        object.setName("Ram");
        object.setRollNo(123);
        object.setClassName("MCA");

//        Student object1 = new Student();
        object.setName("Krishan");
        object.setRollNo(456);
        object.setClassName("MCA");

        // object is a reference variable with final keyword so we can't assign it
//        object = object1;
        System.out.println(object.getName());
    }
}
