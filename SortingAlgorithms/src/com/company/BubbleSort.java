package com.company;

public class BubbleSort {
    public static void bubbleSort(int x[]){
        int n = x.length;
        //Control if swapped , if it doesn't , it means that the array is already sorted
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (x[j] > x[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    }

