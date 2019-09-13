package binarytree;

public class BinarySearchTree {

    public Node<Integer> insert(Node<Integer> root, Node<Integer> node){
        if(root == null){
            return node;
        }
        if(root.value >= node.value){
            root.left = insert(root.left, node);
        }else {
            root.right = insert(root.right, node);
        }
        return root;
    }

    public boolean search(Node<Integer> root, Node<Integer> node){
        if(root == null){
            return false;
        }
        if(root.value == node.value){
            return true;
        }else if(root.value > node.value){
            return search(root.left, node);
        }else {
            return search(root.right, node);
        }
    }
}
