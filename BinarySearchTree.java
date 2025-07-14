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

    public static Node delete(int val, Node root) {
       /* if (root == null) {
            return null;
        }*/
        if (val < root.data) {
            root.left = delete(val, root.left);
        } else if (val > root.data) {
            root.right = delete(val, root.right);
        } else { //root.data = val
            //Case 1: no child
            if (root.left == null && root.right == null)
                return null;

            //Case 2: One child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            //Case 3: Two child
            Node inOrderSuccessor = inOrderSuccessor(root.right); //look for the inOrderSuccessor in the right subtree
            root.data = inOrderSuccessor.data; //put inOrderSuccessor in the root's position
            root.right = delete(inOrderSuccessor.data, root.right); //delete inOrderSuccessor from its previous position
        }
        return root;
    }

     private static Node inOrderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
     }

     //public static int sum = 0;
     public static int rangeSumBST(Node root, int low, int high) {
         int sum = 0;
         if (root == null) {
             return 0;
         }

         if (low <= root.data && root.data <= high) {
             sum += rangeSumBST(root.left, low, root.data);
             sum += rangeSumBST(root.right, root.data, high);
             sum += root.data;
         }
         else if (low > root.data) {
             //Check right subtree
             sum += rangeSumBST(root.right, low, high);
         }
         else {
             //Check left subtree
             sum += rangeSumBST(root.left, low, high);
         }

         return sum;
     }


     public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;
        for (int i : values) {
            root = BinarySearchTree.BST(i, root);
        }
        System.out.println("        " + root.data); // 5
        System.out.print("    " + root.left.data + "       "); // 1
        System.out.println(root.right.data); // 7
        System.out.println("      " + root.left.right.data); // 3
        System.out.print("    " + root.left.right.left.data  + "   "); // 2
        System.out.println(root.left.right.right.data); // 4

         System.out.println();

        boolean result = BinarySearchTree.searchBST(7, root);
        System.out.println(result ? "7 is in the tree" : "7 is not in the tree");

        root = BinarySearchTree.delete(3, root);

         System.out.println("        " + root.data); // 5
         System.out.print("    " + root.left.data + "       "); // 1
         System.out.println(root.right.data); // 7
         System.out.println("      " + root.left.right.data); // 4 takes 3's place
         System.out.print("    " + root.left.right.left.data  + "   "); // 2
         //System.out.println(root.left.right.right.data); //  null instead of 4


    }
}