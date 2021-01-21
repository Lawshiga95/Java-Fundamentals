package com.lawshiga.videotutorial;

public class VarArgs {
    public int display(int... score) {
        int sum=0;
        for(int i : score) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] marks = {70, 30, 50, 80};
        VarArgs varArgs = new VarArgs();

        System.out.println(varArgs.display(marks));
    }
}
