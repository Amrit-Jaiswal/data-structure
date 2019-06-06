package binarytree;

public class BoundaryTraversalMain {
    public static void main(String[] args) {
        Node<Integer> binaryTree = createBinaryTree();
        BoundaryTraversal boundaryTraversal = new BoundaryTraversal();
        boundaryTraversal.printBoundary(binaryTree);

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
        Node<Integer> n9 = new Node<>(58);
        Node<Integer> n10 = new Node<>(50);
        Node<Integer> n11 = new Node<>(40);

        Node<Integer> root = n1;
        n1.left = n2;
        n1.right= n3;

        n2.left = n4;
        n2.right = n5;

        n3.left = n6;
        n3.right = n7;

        n5.left = n8;
        n8.right = n9;

        n6.right = n10;
        n10.right = n11;

        return root;
    }
}
