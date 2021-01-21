package com.lawshiga.videotutorial;

//polymorphism
public class Employee {
    String name;
    double salary;
    public void display(){
        System.out.println("employee");
    }

    public static void main(String[] args) {
        Employee e = new Manager(); //Employee obj and new Manager() linked in runtime
        e.display();
        //e.view(); <--- cannot do this
        e = new GeneralManager();
        e.display();
        Employee e1 = new GeneralManager();
        e1.display();
    }
}
class Manager extends Employee{
    public void display(){
        System.out.println("manager");
    }

    public void view(){
        System.out.println("in manager not in employee");
    }
}

class GeneralManager extends  Manager {
    public void display(){
        System.out.println("in general manager not in employee");
    }
}


