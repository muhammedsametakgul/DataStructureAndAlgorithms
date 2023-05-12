package com.company.circlelinkedlist;

public class CircleLinkedList {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        private int data;
        private com.company.hafta2.CircleLinkedList.Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertFirst(int value){
       Node node = new Node(value);
        if(head== null){
            head=node;
            tail=node;
            size++;
        }else{
            node.next=head;
            head=node;
            tail.next=head;
            size++;
        }
    }
    public void insertLast(int value){
        Node node = new Node(value);
        if(head == null){
            insertFirst(value);
        }else{
            tail.next=node;
            tail=node;
            node.next=head;
            size++;
        }
    }

    public void insertAtIndex(int index,int value){
        Node node = new Node(value);
        if(index==0){
            insertFirst(value);
            return;
        }
        else if(index==size-1){
            insertLast(value);
            return;
        }else{
            temp=head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            node.next=temp.next;
            temp.next=node;
            size++;

        }
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("Liste boş");
            return;
        }else{
            tail.next=head.next;
            head=head.next;
            size--;
        }
    }
    public void deleteLast(){
        if(tail==null){
            System.out.println("Liste boş");
            return;
        }else{
            Node temp = head;
            while(temp.next!=tail){
                temp=temp.next;
            }
            temp.next=head;
            tail=temp;
            size--;
        }
    }
    public void deleteAtIndex(int index){
        if(index==0){
            deleteFirst();
            return;
        }else if(index==size-1){
            deleteLast();
            return;
        }
        else{
            Node temp=head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;

        }
    }

    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node current = head;
        System.out.print("List: ");
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}
