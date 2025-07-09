import java.util.LinkedList;
import java.util.Queue;

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

        public static void postOrderTraversal(Node root) {
            if (root == null) {
                return;
            }
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data +" ");
        }

        public static void levelOrderTraversal(Node root) {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()) {
                Node curr = q.remove();
                if (curr == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    }
                    q.add(null);
                } else {
                    System.out.print(curr.data + " ");
                    if (curr.left != null) {
                        q.add(curr.left);
                    }
                    if (curr.right != null) {
                        q.add(curr.right);
                    }
                }
            }

        }

        public static int countNodes(Node root) {
            if(root == null) {
                return 0;
            }
            int x = countNodes(root.left);
            int y = countNodes(root.right);
            return x + y + 1;
        }

        public static int sumOfNodes(Node root) {
            if(root == null) {
                return 0;
            }
            int leftSum = sumOfNodes(root.left);
            int rightSum = sumOfNodes(root.right);
            return leftSum + rightSum + root.data;
        }


        public static int treeHeight(Node root) {
            if (root == null)
                return 0;
            int leftHeight = treeHeight(root.left);
            int rightHeight = treeHeight(root.right);

            return Math.max(leftHeight + 1, rightHeight + 1);
        }

        //in the first approach, we calculate 3 diameters from left, right and both(using heights) and return the maximum
        //time complexity: O(N^2) -> visit each node and calculate height for each node
        public static int diameterApproach1(Node root) {
            if (root == null) {
                return 0;
            }

            int leftD = diameterApproach1(root.left);
            int rightD = diameterApproach1(root.right);
            int leftRightD = treeHeight(root.left) + treeHeight(root.right) + 1;

            return Math.max(leftD, Math.max(rightD, leftRightD));
        }

        static class TreeInfo {
            int height;
            int diameter;

            TreeInfo(int ht, int diam) {
                height = ht;
                diameter = diam;
            }
        }

        //in this approach, we calculate both the height and diameter within the same function and used a simple static class to return both at once
        //Time complexity: O(n) -> bcoz each node is visited once
        public static TreeInfo diameterApproach2(Node root) {
            if (root == null) {
                return new TreeInfo(0, 0);
            }

            TreeInfo l = diameterApproach2(root.left);
            TreeInfo r = diameterApproach2(root.right);

            int h = Math.max(l.height, r.height) + 1;
            int d = Math.max(l.diameter, Math.max(r.diameter, l.height + r.height + 1));

            return new TreeInfo(h, d);
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

        System.out.println();

        System.out.print("Post order traversal: ");
        tree.postOrderTraversal(root);
        System.out.println();

        System.out.println("Level order traversal: ");
        tree.levelOrderTraversal(root);
        System.out.println();

        System.out.println("Total nodes in the tree: " + tree.countNodes(root));

        System.out.println("Sum of nodes in the tree: " + tree.sumOfNodes(root));

        System.out.println(tree.treeHeight(root));

        System.out.println("Diameter (Approach1): " + tree.diameterApproach2(root).diameter );

        System.out.println("Diameter (Approach2): " + tree.diameterApproach2(root).diameter );
    }

}




