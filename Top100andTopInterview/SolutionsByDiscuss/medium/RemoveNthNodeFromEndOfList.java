package Top100andTopInterview.SolutionsByDiscuss.medium;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0);
        ListNode slow = start, fast = start;
        slow.next = head;
        //느린 것과 빠른 것 사이의 간격이 n이 되도록 앞쪽으로 빠르게 이동
        for(int i = 1 ; i <= n+1; i++) {
            fast = fast.next;
        }
        //간격을 유지하면서 끝까지 빠르게 이동
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        //노드삭제
        slow.next = slow.next.next;
        return start.next;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() { }
        ListNode(int val) { this.val = val;}

        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}