package binarytrees;

public class TreeNode {
    public String val;
    public TreeNode left;
    public TreeNode right;

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public TreeNode(String val) {
        this.val = val;
    }

    public TreeNode(String val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    /**
     * Builds the following binary search tree:
     * <pre>
     *         A
     *       /   \
     *      B     C
     *      \    / \
     *       D  E   F
     *        /   /  \
     *       G   H    I
     * </pre>
     */
    public static TreeNode createTree() {
        //Binary Tree
        TreeNode root = new TreeNode("A");

        TreeNode d = new TreeNode("D");
        TreeNode g = new TreeNode("G");
        TreeNode h = new TreeNode("H");
        TreeNode i = new TreeNode("I");

        TreeNode b = new TreeNode("B");
        b.right = d;

        TreeNode e = new TreeNode("E");
        e.left = g;

        TreeNode f = new TreeNode("F");
        f.left = h;
        f.right = i;

        TreeNode c = new TreeNode("C");
        c.left = e;
        c.right = f;

        root.left = b;
        root.right = c;

        return root;
    }
}
