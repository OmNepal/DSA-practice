class BinarySearchTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int d) {
            data = d;
        }
    }

    public static Node BST(int curr, Node root) {
        if (root == null) {
            root = new Node(curr);
            return root;
        }
        if (curr < root.data) {
            root.left = BST(curr, root.left);
        } else {
            root.right = BST(curr, root.right);
        }
        return root;
    }

    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;
        for (int i : values) {
            root = BinarySearchTree.BST(i, root);
        }
        System.out.println(root.data);
        System.out.print(root.left.data + " ");
        System.out.println(root.right.data);
        System.out.println(root.left.right.data);
    }
}