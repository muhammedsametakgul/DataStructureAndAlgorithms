package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please input the number you want to find factorial\nFaktöriyelini bulmak isteğiniz sayıyı giriniz");
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        System.out.println("Recursive/Rekürsif : "+factorialRecursive(n));

        System.out.print("Iterative/İteratif : "+factorialIterative(n));
    }
    public static int factorialRecursive(int n){
        //Memory Comp = O(n) Time Complexity = O(n)
        // Bu factorialRecursive fonksiyonunun bellek karmaşıklığı O(n) ve zaman karmaşıklığı da O(n) dir.
        if(n==0 ||n==1){
            return 1;
        }else{
            return n*factorialRecursive(n-1);
        }
    }

    public static int factorialIterative(int n){
        //Memory Comp = O(1) Time Complexity = O(n)
        // Bu factorialIterative fonksiyonunun bellek karmaşıklığı O(1) ve zaman karmaşıklığı O(n) dir.
        int carpim=1;
        if(n==0 ||n==1){
            return 1;
        } else {
            for(int i=n;i>0;i--){
                carpim*=i;
            }
            return carpim;
        }

    }
}
