package com.example.binarytree;

public class BoundaryTraversal {

    //print left boundary
    //print leaf node
    //print right boundaryo
    public void printBoundary(Node<Integer> root){
        System.out.println(root.value);
        printLeftNode(root.left);
        printLeafNode(root);
        printRightNode(root.right);
    }

    private void printLeftNode(Node<Integer> root){
        if(root == null){
            return;
        }
        if (root.left != null) {
            System.out.println(root.value);
            printLeftNode(root.left);
        }else if (root.right != null){
            System.out.println(root.value);
            printLeftNode(root.right);
        }
    }

    private void printRightNode(Node<Integer> root){
        if (root == null){
            return;
        }
        if(root.right != null){
            printRightNode(root.right);
            System.out.println(root.value);
        }else if(root.left != null){
            printRightNode(root.left);
            System.out.println(root.value);
        }
    }

    private void printLeafNode(Node<Integer> root){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            System.out.println(root.value);
        }
        printLeafNode(root.left);
        printLeafNode(root.right);
    }
}
