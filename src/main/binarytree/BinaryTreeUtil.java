package com.example.binarytree;

public class BinaryTreeUtil {

    public int numberOfNode(Node<Integer> root){
        if(root == null){
            return 0;
        }
        return 1 + numberOfNode(root.left) + numberOfNode(root.right);
    }

    public boolean isCompleteTree(Node<Integer> root, int index, int totalNode){
        if(root == null){
            return true;
        }

        if(index > totalNode){
            return false;
        }

        return isCompleteTree(root.left, 2*index+1, totalNode)
                && isCompleteTree(root.right, 2*index+2, totalNode);
    }

    public void printLeafNode(Node<Integer> root){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            System.out.print(root.value + " ");
        }
        printLeafNode(root.left);
        printLeafNode(root.right);
    }
}
