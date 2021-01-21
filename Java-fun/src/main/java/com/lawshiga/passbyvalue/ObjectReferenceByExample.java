package com.lawshiga.passbyvalue;

public class ObjectReferenceByExample {

    static class Simpson {
        String name;
    }
    public static void main(String... doYourBest) {
        Simpson simpson = new Simpson();
        transformIntoHomer(simpson);
        System.out.println(simpson.name);//Homer
    }

    static void transformIntoHomer(Simpson simpson) {
        simpson.name = "Homer";
    }

}

