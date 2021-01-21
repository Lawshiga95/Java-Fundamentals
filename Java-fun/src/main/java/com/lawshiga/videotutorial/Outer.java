package com.lawshiga.videotutorial;

public class Outer {
    int a;
    public void show(){}

    class Inner{

    }

    public static void main(String[] args) {
        Outer object1 = new Outer();
        Outer.Inner object3 = object1.new Inner();
    }
}
