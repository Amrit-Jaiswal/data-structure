package binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        Node root = createTree();
        traverse(root);
    }

    private static void traverse(Node<Integer> root){
        Queue<Node> queue = new LinkedList<>();
        if(root == null){
            return;
        }
        queue.add(root);
        while (!queue.isEmpty()){
            Node node = queue.remove();
            System.out.println(node.value);
            if (node.left != null){
                queue.add(node.left);
            }
            if (node.right != null){
                queue.add(node.right);
            }
        }
    }

    private static Node createTree(){
        Node<Integer> n1 = new Node<>(1);
        Node<Integer> n2 = new Node<>(2);
        Node<Integer> n3 = new Node<>(3);
        Node<Integer> n4 = new Node<>(4);
        Node<Integer> n5 = new Node<>(5);
        Node<Integer> n6 = new Node<>(6);
        Node<Integer> n7 = new Node<>(7);
//        Node<Integer> n8 = new Node<>(8);

        Node<Integer> root = n1;
        n1.left = n2;
        n1.right= n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;

        return root;
    }
}
