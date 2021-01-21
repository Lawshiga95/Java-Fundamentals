package com.lawshiga.videotutorial;

public class ArrayObject {
    public static void main(String[] args) {
        int[][] a = {
                {2, 4, 6},
                {2, 5, 3},
                {8, 5, 9},
                {2, 7, 3}
        };
        for(int[] i : a){
            for(int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
