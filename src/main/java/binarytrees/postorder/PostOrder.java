package binarytrees.postorder;

import binarytrees.TreeNode;

public class PostOrder {
    public static void main(String[] args) {
        TreeNode root = TreeNode.createTree();
        postOrder(root);
    }

    private static void postOrder(TreeNode node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val + " ");
    }
}
