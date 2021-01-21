package com.lawshiga.videotutorial;

public class TypeCastingExample {
    public static void main(String[] args) {
        int a = (int)1.3;
        System.out.println(a); // 1-since it round it to floor value

        byte b = 127;
        short c;
        char h;
        int d = 456;
        long e;
        float f;
        double g = 4756;//largest primitive type
        //when it goes up in size java automatically convert the type
        int x = b;
        double t = d;
        System.out.println(x + " " + t);

         c = (short) g;

         char s = 'A';
         char p = 66;
        System.out.println(p);

        float z = 4.54f;
        long w = 3L;
        System.out.println(w);
    }
}
