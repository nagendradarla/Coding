package binarytrees.inorder;

import binarytrees.TreeNode;

public class InOrder {
    public static void main(String[] args) {
        TreeNode root = TreeNode.createTree();
        inOrder(root);
    }

    private static void inOrder(TreeNode node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }
}
