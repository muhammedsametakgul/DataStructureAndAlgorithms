package com.company.doublelinkedlist;

import com.company.hafta2.DoubleLinkedList;

public class Dll {
    public class Node {
        int data;
        DoubleLinkedList.Node prev;
        DoubleLinkedList.Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head;
    Node tail;
    private int size;
    public void insertFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) { // if the list is empty
            head = newNode;
            tail = newNode;
            size++;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            size++;
        }
    }

    public void insertLast(int value){
        Node node = new Node(value);
        if(head==null){
            insertFirst(value);
            return;
        }
        else{
            tail.next=node;
            node.prev=tail;
            tail=node;
            size++;
        }
    }
    public void displayList() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node current = head;
        System.out.print("List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;

        }
        System.out.println();
    }

    public void insertAtIndex(int index, int data) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index.");
            return;
        }

      Node newNode = new Node(data);

        if (index == 0) {
            // Inserting at the beginning of the list
            newNode.next = head;
            if (head != null) {
                insertFirst(data);
            }
        } else if (index == size) {
            insertLast(data);
        } else {
            // Inserting at a specific index within the list
           Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next=current.next;
            newNode.prev=current;
            current.next.prev=newNode;
            current.next=newNode;
            size++;
        }

        size++;
    }

    public void deleteFirst(){
        if (head == null) {
            System.out.println("The list is already empty.");
            return;
        }

        if (head == tail) {
            // Only one node in the list
            head = null;
            tail = null;
        } else {
            // More than one node in the list
            head = head.next;
            head.prev = null;
        }

        size--;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("Liste boş");
            return;
        }
        if(head == null){
            tail = null;
            head = null;
        }else{
            tail=tail.prev;
            tail.next=null;
            size--;
        }
    }

    public void deleteAtIndex(int index){
        if(index==0){
            deleteFirst();
            return;
        }
        else if(index== size-1){
            deleteLast();
            return;
        }else{
          Node current = head;
            for (int i = 0; i < index -1; i++) {
                current = current.next;
            }
            current.next= current.next.next;
            current.next.next.prev=current;
        }
    }


}
