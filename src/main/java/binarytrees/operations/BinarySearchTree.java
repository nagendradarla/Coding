package binarytrees.operations;

public class BinarySearchTree {
    TreeNode root;

    /** Often returns root node
     *
     * @param value
     * @return
     */
    private TreeNode insert(int value) {
        TreeNode node = new TreeNode(value);
        if (root == null) {
            root = node;
            return root;
        } else {
            TreeNode currentNode = root;
            while (true) {
                if (value < currentNode.value) {
                    if (currentNode.left == null) {
                        currentNode.left = node;
                        return root;
                    }
                    currentNode = currentNode.left;
                } else {
                    if (value == currentNode.value) {
                        System.out.println("Value already exists");
                        return root;
                    } else {
                        if (currentNode.right == null) {
                            currentNode.right = node;
                            return root;
                        }
                        currentNode = currentNode.right;
                    }
                }
            }
        }
    }

    /**
    Returns the node it found
     */
    private TreeNode lookup(int value) {
        if (root == null) return null;
        if (root.value == value) return root;
        TreeNode currentNode = root;
        while (true) {
            if (currentNode == null) return null; // breaking condition
            if (value < currentNode.value) {
                currentNode = currentNode.left;
            } else if (value > currentNode.value) {
                currentNode = currentNode.right;
            } else if (value == currentNode.value) {
                return currentNode; // breaking condition
            }
        }
    }

    /**
     * Returns the node that it removed
     * @param value
     * @return
     */
    private TreeNode remove(int value) {
        if (root == null){
            return null;
        }
        TreeNode parentNode = null;
        TreeNode currentNode = root;
        while (currentNode != null) {
            if(value < currentNode.value) {
               parentNode = currentNode;
               currentNode = currentNode.left;
            } else if (value > currentNode.value) {
                parentNode = currentNode;
                currentNode = currentNode.right;
            } else if (value == currentNode.value) {
                // currentNode has to be deleted
                /** Option 1 : If current node does not have right node */
                if (currentNode.right == null) { // Assign left node in place of the currentNode
                    if (parentNode == null) { // if root node
                        root = currentNode.left;
                    } else if (currentNode.value > parentNode.value) { // if currentNode is right node
                        parentNode.right = currentNode.left;
                    } else { // if currentNode is left node
                        parentNode.left = currentNode.left;
                    }
                    return currentNode;
                    /** Option 2 : If current node's right node does not have left node */
                } else if(currentNode.right.left == null) { // Assign the right node in place of currentNode
                    if(parentNode == null) {
                        root = currentNode.right;
                        root.left = currentNode.left;
                    } else if (currentNode.value > parentNode.value) { // If current node is right node
                        parentNode.right = currentNode.right;
                        parentNode.right.left = currentNode.left;
                        //parentNode.left = currentNode.left;
                    } else { // if currentNode is left node
                        parentNode.left = currentNode.right;
                        parentNode.left.left = currentNode.left;
                    }
                    return currentNode;
                    /** Option 3 : If current node's right node has left node */
                } else if (currentNode.right.left != null) { // Assign current left most node of the right node in place of currentNode
                    //find left most node of the right
                    /*TreeNode rightNode = currentNode.right;
                    TreeNode leftNode = currentNode.right.left;
                    TreeNode leftMostNode = leftNode;
                    while(leftMostNode.left != null) {
                        leftNode = leftMostNode;
                        leftMostNode = leftNode.left;
                    }*/

                    TreeNode parentOfLeftMost = currentNode.right;
                    TreeNode leftMost = parentOfLeftMost.left;

                    while (leftMost.left != null) {
                        parentOfLeftMost = leftMost;
                        leftMost = leftMost.left;
                    }

                    parentOfLeftMost.left = leftMost.right;
                    /*if (leftMost.right != null) {
                        parentOfLeftMost.left = leftMost.right;
                    } else {
                        parentOfLeftMost.left = null;
                    }*/
                    leftMost.left = currentNode.left;
                    leftMost.right = currentNode.right;
                    if (parentNode == null) { //deleting root node
                        root = leftMost;
                    } else if (currentNode.value > parentNode.value) {
                        parentNode.right = leftMost;
                        //leftMostNode.left = currentNode.left;
                        //leftMostNode.right = currentNode.right;
                    } else {
                        parentNode.left = leftMost;
                        //leftMostNode.left = currentNode.left;
                        //leftMostNode.right = currentNode.right;
                    }
                    return currentNode;
                }
            }

        }
        return null;
    }

    private static class TreeNode {
        private int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }

    public static void printTree(TreeNode root) {
        printTreeHelper(root, 0);
        System.out.println("\n==============================\n");
    }

    private static void printTreeHelper(TreeNode node, int level) {
        if (node == null) return;

        // Print right subtree first
        printTreeHelper(node.right, level + 1);

        // Print current node value with indentation
        System.out.println("    ".repeat(level) + node.value);

        // Print left subtree
        printTreeHelper(node.left, level + 1);
    }

    public static void printAscii(TreeNode root) {
        printAsciiHelper(root, "", true);
    }

    private static void printAsciiHelper(TreeNode node, String prefix, boolean isLeft) {
        if (node == null) return;

        System.out.println(prefix + (prefix.isEmpty() ? "" : (isLeft ? "├── " : "└── ")) + node.value);

        String newPrefix = prefix + (prefix.isEmpty() ? "" : (isLeft ? "│   " : "    "));
        printAsciiHelper(node.left, newPrefix, true);
        printAsciiHelper(node.right, newPrefix, false);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(8);
        tree.insert(4);
        tree.insert(10);
        tree.insert(2);
        tree.insert(6);
        tree.insert(20);
        printTree(tree.root);

        tree.insert(11);

        printTree(tree.root);

        tree.insert(3);

        printTree(tree.root);

        //System.out.println(tree.lookup(10));
        //System.out.println(tree.lookup(100));

        tree.remove(4);
        printTree(tree.root);
    }
}
