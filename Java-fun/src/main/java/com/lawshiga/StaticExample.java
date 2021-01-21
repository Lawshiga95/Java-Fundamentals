package com.lawshiga;

public class StaticExample {

    static int c;
    static
    {
        int x = 5;
        int y = 10;
        c = x*y;
    }

    public static void main(String args[])
    {
        System.out.println("Calculation = "+StaticExample.c);

    }
}
