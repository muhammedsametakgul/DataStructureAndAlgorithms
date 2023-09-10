package com.company;

import java.util.Arrays;

import static com.company.MergeSort.merge;

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

        int[] array2 = {5, 2, 8, 12, 1, 6, 3, 9};

        System.out.println("Array before sorting:");
        SelectionSort.printArray(array2);

        SelectionSort.selectionSort(array2);

        System.out.println("Array after sorting:");
        SelectionSort.printArray(array2);

        System.out.println("************************************************************************");
        int[] arr = {5, 9, 1, 3, 8, 4, 7, 2, 6};
        System.out.println("Original array:");
        QuickSort.printArray(arr);

        QuickSort.quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        QuickSort.printArray(arr);

        System.out.println("*************************************************************************");
        int[] array3 = { 9, 5, 1, 4, 3 };
        System.out.println("Array before sorting:");
        InsertionSort.printArray(array3);

        InsertionSort.insertionSort(array3);

        System.out.println("Array after sorting:");
        InsertionSort.printArray(array3);

        System.out.println("***********************************************************************");
        int[] array1 = {1,3,7,8};
        int[] array11 = {2,4,5,6};

        System.out.println( Arrays.toString( merge(array1, array11) ) );
    }
}
