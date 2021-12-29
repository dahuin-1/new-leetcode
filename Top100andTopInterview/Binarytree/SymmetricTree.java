package Top100andTopInterview.Binarytree;

import java.util.*;

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root.left);
        stack.push(root.right);
        TreeNode left, right;

        while (!stack.empty()) {
            left = stack.pop();
            right = stack.pop();
            if (left == null && right == null) {
                continue;
            }
            if (left == null || right == null || left.val != right.val) {
                return false;
            }
            stack.push(left.left);
            stack.push(right.right);
            stack.push(left.right);
            stack.push(right.left);
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

/*
public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        TreeNode currentNode = root;

        if (currentNode == null) {
            return false;
        }
        q.offer(currentNode);
        while (!q.isEmpty()) {
            Stack<TreeNode> stack = new Stack<>();
            int size = q.size();
            int halfSize = q.size() / 2;
            for (int i = 0; i < size; i++) {
                if (q.peek().left != null) {
                    q.offer(q.peek().left);
                }
                if (q.peek().right != null) { //
                    q.offer(q.peek().right);
                }
                stack.push(q.poll()); //
            }
            if (stack.pop() == q.poll()) {
                return false;
            }
        }
        return true;
    }
 */
