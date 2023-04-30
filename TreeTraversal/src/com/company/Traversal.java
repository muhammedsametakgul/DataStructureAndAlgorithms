package com.company;


class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

// Root - Left - Right
 class PreorderTraversal {
    public void preorder(Node node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }
}

// Left - Root - Right
class InorderTraversal{
    public void inorder(Node node){
        if(node !=null){
            inorder(node.left);
            System.out.print(node.value +" ");
            inorder(node.right);
        }
    }
}

// Left - Right - Root
class PostorderTraversal{
    public void postorder(Node node){
        if (node != null){
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.value + " ");
        }
    }
}