package com.company;

public class Main {

    public static void main(String[] args) {
        //Bubble Sorted
        int[] array = {5, 2, 8, 12, 1, 6, 3, 9};

        System.out.println("Array before sorting:");
        BubbleSort.printArray(array);

        BubbleSort.bubbleSort(array);

        System.out.println("Array after sorting:");
        BubbleSort.printArray(array);


        System.out.println("******************************************************************");
    }
}
