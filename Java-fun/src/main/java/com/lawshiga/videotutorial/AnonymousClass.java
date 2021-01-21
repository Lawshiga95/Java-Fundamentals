package com.lawshiga.videotutorial;

public class AnonymousClass {
    public static void main(String[] args) {
        Student student = () -> System.out.println("added new student");
            }
//            Student s = new Learner();
//            s.show();
    }

//@FunctionalInterface
 interface Student{
     void show();
     default void view(){
         System.out.println("in functional interface");
     }
}
class Learner implements Student{
    public void show(){
        System.out.println("in learner");
    }
}
