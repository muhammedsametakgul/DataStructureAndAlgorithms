package com.company;

public class Main {

    public static void main(String[] args) {
	BinarySearchTree bst = new BinarySearchTree();
    bst.insert(10);
    bst.insert(20);
    bst.insert(8);
    bst.insert(30);
    bst.insert(1);
    bst.insert(43);
    bst.insert(9);

    bst.printInOrder();
        System.out.println();
        BinarySearchTree.Node foundNode = bst.search(10);

        if (foundNode != null) {
            System.out.println("Node bulundu: " + foundNode.value);
        } else {
            System.out.println("Ağaçta böyle bir Node yok");
        }
        System.out.println();
        System.out.println("Min değer: " + bst.findMin().value);
        System.out.println("Max değer: "+ bst.findMax().value);


    }
}
