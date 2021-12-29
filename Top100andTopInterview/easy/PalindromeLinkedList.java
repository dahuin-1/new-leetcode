package Top100andTopInterview.easy;

import java.util.Stack;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null) return false;
        ListNode currentNode = head;
        Stack stack = new Stack();

        while (currentNode != null) {
            stack.push(currentNode.val);
            currentNode = currentNode.next;
        }

        while (head != null) {
            if (head.val != (int) stack.pop()) {
                return false;
            }
            head = head.next;
        }
        return true;
    }

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
