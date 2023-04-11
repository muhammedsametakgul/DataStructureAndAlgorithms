package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("************************* RECURSİVE - REKÜRSİF********************************");
        System.out.println("Lütfen kaçıncı fibonacci sayısını görmek istediğinizi belirtiniz \nPlease let us inform which fibonacci serie item you want to see");
        int item=input.nextInt();
        System.out.println(recursiveMethod(item));

        System.out.println("************************* ITERATIVE - İTERATİF********************************");
        System.out.println("Lütfen kaçıncı fibonacci sayısını görmek istediğinizi belirtiniz \nPlease let us inform which fibonacci serie item you want to see");
        int item2=input.nextInt();
        System.out.println(iterativeMethod(item2));

    }

    public static long recursiveMethod(int n){
        System.out.println("Time complexity of recursive = O(2^n) -> every usage of that functions will call itself two times. It means it will make its time complexity = 2^n ");
        System.out.println("Memory complexity of iterative = O(n) -> because every usage of that function will use same variables again and again when function calls itself");
        if(n<=1 ){
            return n;
        }
        return(recursiveMethod(n-1) +recursiveMethod(n-2));
    }


    public static long iterativeMethod(int n){
        System.out.println("Time complexity of iterative = O(n) -> for loop will work for n times");
        System.out.println("Memory complexity of iterative = O(1) -> because they are used in constant amount of variable not array etc...");
        int prev=0;
        int prevprev=0;
        int next=1;
        if(n<=1){
            return n;
        }
        for(int i=1;i<n;i++){
            prevprev=prev;
            prev=next;
           next=prev+prevprev;
        }
        return next;

    }
}
