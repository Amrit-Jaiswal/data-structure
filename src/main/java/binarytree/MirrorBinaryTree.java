package binarytree;

public class MirrorBinaryTree {
    public static void main(String[] args) {
        Node root = createTree();
        printTreeInOrder(root);
        mirror(root);
        System.out.println("After mirroring");
        printTreeInOrder(root);

    }

    private static void mirror(Node<Integer> root){
        if(root == null){
            return;
        }
        mirror(root.left);
        mirror(root.right);

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

    }


    private static void printTreeInOrder(Node<Integer> root){
        if (root == null){
            return;
        }
        printTreeInOrder(root.left);
        System.out.print(root.value+ " ");
        printTreeInOrder(root.right);
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
