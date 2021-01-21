package com.lawshiga.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {7, 4, 9, 3, 2};
//        int temp, k, j;

        for(int k=1; k<a.length; k++){
            int temp = a[k];
            int j = k-1;
            while(j>=0 && temp <= a[j]){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
        }

        for(int k=0; k<a.length; k++) {
            System.out.print(a[k]);
        }
    }
}
