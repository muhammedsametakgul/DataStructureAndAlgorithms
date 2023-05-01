package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome");
        System.out.println("Please input disc amount / Lütfen disk adedini giriniz:");
        Scanner input = new Scanner(System.in);
        int disc_amount=input.nextInt();

        // A, B and C are names of rods
        HanoiTower(disc_amount, 'A', 'C', 'B');
    }


    public static void HanoiTower(int disc,char start,char dest,char temp){
        if(disc==0){//disk adedi 0 ise programı kapatıyor
            return;
        }
        //disk adedi 1 eksiği kadar da kendi arasında işlem yapar
        //örneğin 3 disk vardır üstteki iki disk kendi arasında işleme tabi tutulur bundan dolayı rekürsif yapı yapı tercih edildi
        HanoiTower(disc-1,start,temp,dest);
        System.out.println("Disk"+ disc+" from "+ start+ "->" + dest);
        HanoiTower(disc-1,temp,dest,start);
    }
}
