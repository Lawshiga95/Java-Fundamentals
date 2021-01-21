package com.lawshiga.tutorial;

import java.util.ArrayList;
import java.util.logging.Logger;

public class PrintClassLoader {

    public  void printClassLoader(){
        System.out.println("Classloader of this class :" + PrintClassLoader.class.getClassLoader());
        System.out.println("Classloader of logging :" + Logger.class.getClassLoader());
        System.out.println("Classloader of arraylist :" + ArrayList.class.getClassLoader());
    }

    public static void main(String[] args) {
        PrintClassLoader printClassLoader = new PrintClassLoader();
        printClassLoader.printClassLoader();
    }
}
