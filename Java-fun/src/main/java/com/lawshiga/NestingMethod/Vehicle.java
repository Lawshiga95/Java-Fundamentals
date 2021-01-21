package com.lawshiga.NestingMethod;

public class Vehicle {
    private double distance;
    private double time;

    public double findSpeed(double distance, double time) {
        return distance/time;
    }

    public void displaySpeed(double distance, double time) {

        System.out.println("speed:" + findSpeed(distance, time));
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "distance=" + distance +
                ", time=" + time +
                '}';
    }

    public static void main(String args[]){
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle();

        System.out.println(vehicle1);
        System.out.println(vehicle1.findSpeed(100, 5));
        System.out.println(vehicle2.findSpeed(300, 2));
        System.out.println(vehicle2);
    }
}
