class BinaryTreePractice {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1)
                return null;

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preOrderTraversal(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);

        }

        public static void inOrderTraversal(Node root) {
            if (root == null) {
                return;
            }
            inOrderTraversal(root.left);
            System.out.print(root.data +" ");
            inOrderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println("Root: " + root.data);

        System.out.print("Pre order traversal: ");
        tree.preOrderTraversal(root);

        System.out.println();

        System.out.print("In order traversal: ");
        tree.inOrderTraversal(root);
    }

}




