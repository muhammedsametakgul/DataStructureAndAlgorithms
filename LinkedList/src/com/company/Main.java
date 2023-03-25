package com.company;

import com.company.doublelinkedlist.Dll;
import com.company.singlelinkedlist.Ll;




public class Main {
    public static void main(String[] args) {
        //Single Linked List

        Ll list = new Ll();
        list.insertFirst(5);
        list.insertFirst(7);
        list.insertFirst(9);
        list.insertFirst(11);
        list.insertFirst(74);
        list.insertLast(741);
        list.insert(33, 3);
        list.insert(41, 4);
        list.deleteFirst();
        list.deleteLast();
        System.out.println(list.deleteFirst());
        System.out.println(list.delete(0));
        list.display();

      Dll dl = new Dll();
        dl.insertFirst(5);
        dl.insertFirst(7);
        dl.insertFirst(78);
        dl.insertFirst(12);

        dl.display();


    }

    }


