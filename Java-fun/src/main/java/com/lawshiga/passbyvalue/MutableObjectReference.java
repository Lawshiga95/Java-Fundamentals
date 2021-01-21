package com.lawshiga.passbyvalue;

public class MutableObjectReference {
    public static void main(String... mutableObjectExample) {
        StringBuilder name = new StringBuilder("Homer ");
        addSureName(name);
        System.out.println(name);//Homer Simpson
    }

    static void addSureName(StringBuilder name) {
        name.append("Simpson");
    }
}
