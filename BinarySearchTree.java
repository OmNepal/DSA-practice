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

    public static boolean searchBST(int key, Node root) {
        if (root == null)
            return false;

        if (key < root.data) {
            return searchBST(key, root.left);
        } else if (root.data == key){
            return true;
        } else {
            return searchBST(key, root.right);
        }

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

        boolean result = BinarySearchTree.searchBST(7, root);
        System.out.println(result);
    }
}