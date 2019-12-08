package binarytree;

public class CheckSubTree {

    private boolean areIdentical(Node<Integer> s, Node<Integer> t){
        if(s == null && t == null){
            return true;
        }
        if(s == null || t == null){
            return false;
        }

        return (s.value == t.value) && areIdentical(s.left, t.left) && areIdentical(s.right, t.right);
    }

    private boolean isSubTree(Node<Integer> s, Node<Integer> t){
        if(t == null){
            return true;
        }
        if (s == null){
            return false;
        }
        if(areIdentical(s,t)){
            return true;
        }

        return isSubTree(s.left, t) || isSubTree(s.right, t);
    }

    Node<Integer> root1, root2;
    public static void main(String[] args) {
        CheckSubTree tree = new CheckSubTree();

        tree.root1 = new Node(26);
        tree.root1.right = new Node(3);
        tree.root1.right.right = new Node(3);
        tree.root1.left = new Node(10);
        tree.root1.left.left = new Node(4);
        tree.root1.left.left.right = new Node(30);
        tree.root1.left.right = new Node(6);

        tree.root2 = new Node(10);
        tree.root2.right = new Node(6);
        tree.root2.left = new Node(4);
        tree.root2.left.right = new Node(30);

        if (tree.isSubTree(tree.root1, tree.root2))
            System.out.println("Tree 2 is subtree of Tree 1 ");
        else
            System.out.println("Tree 2 is not a subtree of Tree 1");

    }
}
