package AnotherProblems.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrder_103 {


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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> resultList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode currentNode = root;
        int count = 1;
        if (currentNode == null) {
            return resultList;
        }
        queue.offer(currentNode);
        while (!queue.isEmpty()) {
            List<Integer> sublist = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                if (count % 2 != 0) {
                    if (queue.peek().right != null) {
                        queue.offer(queue.peek().right); //peek
                    }
                    if (queue.peek().left != null) {
                        queue.offer(queue.peek().left);
                    }
                    sublist.add(queue.poll().val);
                    count++;
                } else {
                    if (queue.peek().left != null) {
                        queue.offer(queue.peek().left); //peek
                    }
                    if (queue.peek().right != null) {
                        queue.offer(queue.peek().right);
                    }
                    sublist.add(queue.poll().val);
                    count++;
                }
            }
            resultList.add(sublist);
        }
        return resultList;
    }

}
