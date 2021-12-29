package AnotherProblems.binaryTree;

import java.util.Stack;

public class ValidateBinarySearchTree_98 {
    public static void main(String[] args) {
    }

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = root;
        TreeNode pre = null;
        while (currentNode != null || !stack.empty()) {
            while (currentNode != null) {
                stack.add(currentNode);
                currentNode = currentNode.left;
            }
            currentNode = stack.pop();

            if (pre != null && currentNode.val <= pre.val) {
                return false;
            }
            pre = currentNode;

            currentNode = currentNode.right;
        }
        return true;
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
