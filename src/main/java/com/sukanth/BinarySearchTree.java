package com.sukanth;

public class BinarySearchTree {
    Node root;

    class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
        }
    }

    public void insertNewNode(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;

        } else {
            Node focusNode = root;
            Node parentNode;
            while (true) {
                parentNode = focusNode;
                if (data < focusNode.data) {
                    focusNode = focusNode.left;
                    if (focusNode == null) {
                        parentNode.left = newNode;
                    }
                } else {
                    focusNode = focusNode.right;
                    if (focusNode == null) {
                        parentNode.right = newNode;
                    }
                }
            }
        }
    }

    public Node findNode(int data) {
        Node focusNode = root;
        while (focusNode.data != data) {
            if (data < focusNode.data) {
                focusNode = focusNode.left;
            } else {
                focusNode = focusNode.right;
            }
        }
        return focusNode;
    }

    public void preOrderTreeTraversal(Node focusNode){
        if(focusNode !=null){
            System.out.println(focusNode);
            preOrderTreeTraversal(focusNode.left);
            preOrderTreeTraversal(focusNode.right);
        }
    }

    public void inOrderTreeTraversal(Node focusNode){
        if(focusNode !=null){
            inOrderTreeTraversal(focusNode.left);
            System.out.println(focusNode);
            inOrderTreeTraversal(focusNode.right);
        }
    }

    public void postOrderTreeTraversal(Node focusNode){
        if(focusNode !=null){
            postOrderTreeTraversal(focusNode.left);
            postOrderTreeTraversal(focusNode.right);
            System.out.println(focusNode);
        }
    }


    /**
     * left root right
     * root left right
     * left right root
     *
     */

    public static void main(String[] args) {

    }

}
