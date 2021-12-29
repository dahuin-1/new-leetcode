package Top100andTopInterview.SolutionsByDiscuss.binarytree;

import java.util.*;

public class BinaryTreeZigzagLevelOrder_sol {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        TreeNode currentNode = root;
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        if(currentNode == null) return resultList;
        Stack<TreeNode> stack1 = new Stack<TreeNode>();
        Stack<TreeNode> stack2 = new Stack<TreeNode>();

        stack1.push(root);
        while(!stack1.isEmpty()||!stack2.isEmpty()) {
            List<Integer> subList = new ArrayList<Integer>();
            while(!stack1.isEmpty()) {
                currentNode = stack1.pop();
                subList.add(currentNode.val);
                if(currentNode.left!=null) stack2.push(currentNode.left);
                if(currentNode.right!=null) stack2.push(currentNode.right);
            }
            resultList.add(subList);
            subList = new ArrayList<Integer>();
            while(!stack2.isEmpty()) {
                currentNode = stack2.pop();
                subList.add(currentNode.val);
                if(currentNode.right!=null)stack1.push(currentNode.right);
                if(currentNode.left!=null)stack1.push(currentNode.left);
            }
            if(!subList.isEmpty()) resultList.add(subList);
        }
        return resultList;
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

