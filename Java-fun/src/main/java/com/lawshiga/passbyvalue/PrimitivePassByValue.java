package com.lawshiga.passbyvalue;

public class PrimitivePassByValue {
    public static void main(String[] args) {
        int formerAge = 30;
        changeAge(formerAge);
        System.out.println(formerAge); // 30
        System.out.println(changeAge(formerAge)); //35
    }
    static int changeAge(int age) {
        return age = 35;
    }
}
