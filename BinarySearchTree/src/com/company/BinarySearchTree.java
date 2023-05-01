package com.company;

public class BinarySearchTree {
    Node root;
    public BinarySearchTree(){
        root = null;
    }
    static class Node{
        int value;
        Node left ,right;

        public Node( ){

            this.left=null;
            this.right= null;
        }
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            Node node2 = new Node();
            node2.value=value;
            return node2;
        }

        if (value < node.value) {
            node.left = insert(node.left, value);
        } else if (value > node.value) {
            node.right = insert(node.right, value);
        }

        return node;
    }


    public void delete(int value){
        root = delete(root,value);
    }
    public Node delete(Node node,int value){
        if (node == null) {
            return null;
        }

        if (value < node.value) {
            node.left = delete(node.left, value);
        } else if (value > node.value) {
            node.right = delete(node.right, value);
        } else {
            if (node.left == null && node.right == null) {
                return null;
            } else if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            } else {
                Node minNode = findMinNode(node.right);
                node.value = minNode.value;
                node.right = delete(node.right, minNode.value);
            }
        }

        return node;
    }


    private Node findMinNode(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;

    }

    public void printInOrder() {
        printInOrder(root);
    }

    private void printInOrder(Node node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.print(node.value + " ");
            printInOrder(node.right);
        }
    }
    public Node search(int value){
        return  search(root,value);
    }

    public Node search(Node root, int value)
    {
        if (root == null || root.value == value)
            return root;

        if (root.value < value)
            return search(root.right, value);
        else
        return search(root.left, value);
    }

    public Node findMin(){
        Node temp = root;
        if (root == null){
            return null;
        }
        while (temp.left !=null){
            temp = temp.left;
        }
        return  temp;
    }

    public Node findMax(){
        Node temp =root;
        if (root == null){
            return null;
        }
        while (temp.right !=null){
            temp = temp.right;
        }
        return temp;
    }
}
