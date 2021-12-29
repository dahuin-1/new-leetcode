package Top100andTopInterview.SolutionsByDiscuss.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal_sol {

    public List<List<Integer>> levelOrder(TreeNode root) {
        TreeNode currentNode = root;
        List<List<Integer>> resultList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if (currentNode == null) {
            return resultList;
        }
        queue.offer(currentNode);
        while(!queue.isEmpty()) {
            List<Integer> sublist = new ArrayList<>();
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                if(queue.peek().left != null) {
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right != null) { //
                    queue.offer(queue.peek().right);
                }
                sublist.add(queue.poll().val); //
            }
            resultList.add(sublist);
        }
        return resultList;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
