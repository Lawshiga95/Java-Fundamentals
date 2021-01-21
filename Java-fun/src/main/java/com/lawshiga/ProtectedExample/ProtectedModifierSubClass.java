package com.lawshiga.ProtectedExample;

import com.lawshiga.accessmodifier.PrivateClassExample;

public class ProtectedModifierSubClass extends PrivateClassExample {
    protected double salary;
    protected String designation;

    public int accessAge(int age){
        return getAge();//accessing getAge() from the superclass
    }
}
