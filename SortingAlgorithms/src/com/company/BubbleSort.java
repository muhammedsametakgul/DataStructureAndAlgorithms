package com.company;

public class BubbleSort {
    public static void bubbleSort(int[] array){
        int lenghtArray=array.length;
        for(int i=lenghtArray-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(array[j] >array[j+1]){
                    int temp=array[j];
                    array[j] = array[j+1];
                    array[j+1]=temp;
                }
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

