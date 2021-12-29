package Top100andTopInterview.SolutionsByDiscuss.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrder_sol2 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> resultList = new ArrayList<>();
        if(root == null){ return resultList; }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        boolean order = true;
        int size = 1;

        while(!q.isEmpty()) {
            List<Integer> subList = new ArrayList<>();
            for(int i = 0; i < size; ++i) {
                TreeNode currentNode = q.poll();
                if(order) {
                    subList.add(currentNode.val);
                } else {
                    subList.add(0, currentNode.val);
                }
                if(currentNode.left != null) q.add(currentNode.left);
                if(currentNode.right != null) q.add(currentNode.right);
            }
            resultList.add(subList);
            size = q.size();
            order = !order;
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
