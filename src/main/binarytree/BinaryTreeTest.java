package com.example.binarytree;

public class BinaryTreeTest {
    public static void main(String[] args) {
        Node<Integer> root = createBinaryTree();
        TraverseBT traverseBT = new TraverseBT();
        traverseBT.preOrderTraversal(root);
        System.out.println("\n");
        traverseBT.inOrderTraversal(root);
        System.out.println("\n");
        traverseBT.postOrderTraversal(root);
        System.out.println("\n");

        BinaryTreeUtil binaryTreeUtil = new BinaryTreeUtil();
        //count number of node in binary tree
        int numberOfNode = binaryTreeUtil.numberOfNode(root);
        System.out.println(binaryTreeUtil.numberOfNode(root));

        System.out.println(binaryTreeUtil.isCompleteTree(root, 0, numberOfNode));

        binaryTreeUtil.printLeafNode(root);

    }

    private static Node<Integer> createBinaryTree(){
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(5);
        Node<Integer> n5 = new Node<>(15);
        Node<Integer> n6 = new Node<>(8);
        Node<Integer> n7 = new Node<>(9);
        Node<Integer> n8 = new Node<>(22);

        Node<Integer> root = n1;
        n1.left = n6;
        n1.right= n2;
        n6.left = n4;
        n6.right = n7;
        n2.left = n5;
        n2.right = n3;
        n3.left = n8;

        return root;
    }
}
