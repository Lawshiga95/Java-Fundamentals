package com.lawshiga.sorting;

public class BubbleSort {

    public static void main(String[] args) {

        int[] a = {7, 4, 9, 3, 2};
        int temp, i, j;

        for (i = 0; i < a.length; i++) {
            for (j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (i = 0; i < a.length; i++) {
            for (j = 1; j < (a.length - i); j++) {
                if (a[j - 1] > a[j]) {
                    //swap elements
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }

            }
        }

            for (i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }

