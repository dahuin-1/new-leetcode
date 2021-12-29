package Top100andTopInterview.easy;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head == null)  return false;
        ListNode rabbit = head;
        ListNode turtle = head;
        while (rabbit.next != null && rabbit.next.next != null) {
            rabbit = rabbit.next.next;
            turtle = turtle.next;
            if(turtle == rabbit) {
                return true;
            }
        }
        return false;
    }


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
