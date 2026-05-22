package binarytrees.preorder;

import binarytrees.TreeNode;

import static binarytrees.TreeNode.createTree;

public class PreOrder {

    public static void main(String[] args) {
       TreeNode root = createTree();
       preOrder(root);
    }

    private static void preOrder(TreeNode node) {
        if (node == null) return;
        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

}

