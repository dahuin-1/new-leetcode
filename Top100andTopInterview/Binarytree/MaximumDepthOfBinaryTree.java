package Top100andTopInterview.Binarytree;

import java.util.*;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {

        if (root == null) return 0;

        Queue<TreeNode> queue = new LinkedList();
        List<List<Integer>> resultList = new ArrayList<>();
        TreeNode currentNode = root;

        queue.offer(currentNode);
        while (!queue.isEmpty()) {
            List<Integer> sublist = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                if (queue.peek().left != null) {
                    queue.offer(queue.peek().left);
                }
                if (queue.peek().right != null) { //
                    queue.offer(queue.peek().right);
                }
                sublist.add(queue.poll().val); //
            }
            resultList.add(sublist);
        }
        return resultList.size();
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
