package com.lawshiga.videotutorial;

public class Operator {
    public static void main(String[] args) {
        int m = 5, n = 4;
        n += m;
        System.out.println(m);
        System.out.println(n);

        m = n++;
        System.out.println(m);
        System.out.println(n);
    }
}
