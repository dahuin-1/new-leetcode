package Top100andTopInterview.SolutionsByDiscuss;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class addTwoNum {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode newNode = new ListNode(0);
        ListNode dummy = newNode;
        int sum = 0;
        while(c1 != null || c2 != null|| sum > 9) {
            sum /= 10;
            if(c1 != null){
                sum += c1.val;
                c1 = c1.next;
            }
            if(c2 != null) {
                sum += c2.val;
                c2 = c2.next;
            }
            dummy.next = new ListNode(sum % 10);
            dummy = dummy.next;
        }
        return newNode.next;
    }

    public static class ListNode {
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
