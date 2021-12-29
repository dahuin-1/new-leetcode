package Top100andTopInterview.SolutionsByDiscuss;

import Top100andTopInterview.easy.IntersectionOfTwoLinkedLists;

public class IntersectionofTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //boundary check
        if(headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        //if a & b have different len, then we will stop the loop after second iteration
        while( a != b){
            //for the end of first iteration, we just reset the pointer to the head of another linkedlist
            a = a == null? headB : a.next;
            b = b == null? headA : b.next;
        }

        return a;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}

/*

https://leetcode.com/problems/intersection-of-two-linked-lists/discuss/49785/Java-solution-without-knowing-the-difference-in-len!
 */