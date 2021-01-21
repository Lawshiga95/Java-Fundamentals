package com.lawshiga.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {7, 4, 9, 3, 2};
        int temp, i, j;

        for(i=0; i<a.length; i++) {
            j = smallestElement(a, a.length, i);
            temp = a[j];
            a[j] = a[i];
            a[i] = temp;
        }

        for(i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }

    }
    static int smallestElement(int[] a, int length, int i) {
        int smallest = a[i];
        for(int j=i+1; j<length; j++){
            if(a[j] < smallest) {
                smallest = a[j];
                i = j;
            }
        }
        return i;
    }
}
