package com.lawshiga.videotutorial;
//when we put primitive variable inside a box is called boxing
        /*
        int Integer
        float Float
        double Double
        boolean Boolean
        */
public class Autoboxing {
    public static void main(String[] args) {
        int i = 5;
        Integer k = new Integer(i);//boxing
        Integer j = i;//autoboxing
        System.out.println(j);
        int m = j.intValue();//unboxing
        int n = j;//auto unboxing
    }
}
