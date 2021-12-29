package Top100andTopInterview.easy;

import java.util.List;
import java.util.Stack;

public class LinkedListReverse {
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return null;
        }
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }

        ListNode result = new ListNode();

        while(!stack.isEmpty()){
           result = stack.pop();
           result.next = result;
        }
       return null;
    }


      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
}

