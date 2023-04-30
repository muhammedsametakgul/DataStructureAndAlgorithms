package com.company;

public class Main {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        PreorderTraversal traversal = new PreorderTraversal();
        traversal.preorder(root);

        System.out.println("");

        InorderTraversal inorder = new InorderTraversal();
        inorder.inorder(root);

        System.out.println("");
        PostorderTraversal postorder = new PostorderTraversal();
        postorder.postorder(root);

    }
}
