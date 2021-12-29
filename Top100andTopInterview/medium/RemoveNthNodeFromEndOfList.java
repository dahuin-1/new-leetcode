package Top100andTopInterview.medium;

import java.util.List;
import java.util.Stack;

//19번 문제
public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0);
        ListNode fast = head;
        ListNode slow = head;

        for (int i = 1; i <= n + 1; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return start.next;
    }
       /* if (head.next==null) {
            return null;
        }
        ListNode returnNode = new ListNode();
        Stack<ListNode> stack = new Stack<>();
        while (head.next != null){
            stack.add(head);
            head = head.next;
        }
        for(int i = 0; i < stack.size(); i++) {
            if (i == n) {
                stack.pop();
            } else {
                returnNode = stack.peek();
                returnNode.next = returnNode;
            }
        }
        return returnNode;
    }*/


    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
