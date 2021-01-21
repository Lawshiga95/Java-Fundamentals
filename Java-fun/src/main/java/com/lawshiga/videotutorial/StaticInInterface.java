package com.lawshiga.videotutorial;

public interface StaticInInterface {
    int a = 5;
    void create();
    static void show(){
//        a = 6;
        System.out.println("in interface");
    }
}
class Demo{
    public static void main(String[] args) {
        StaticInInterface.show();
    }
}
