package com.lawshiga.passbyvalue;

public class StringValueChange {
    public static void main(String... doYourBest) {
        String name = "x";
        changeToHomer(name);
        System.out.println(name);//x
    }

    static void changeToHomer(String name) {
        name = "Homer";
    }
}
