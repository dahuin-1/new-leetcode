package Top100andTopInterview.easy;

import java.util.Stack;

public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        Stack<ListNode> stackA = new Stack<>();
        Stack<ListNode> stackB = new Stack<>();
        ListNode result = null;

        if (headA.next == null && headB.next == null) { //둘다 원소가 하나면
            if (headA.val == headB.val) {
                return headA; //같은 그 값을 리턴
            } else {
                return null;
            }
        }

        if(headA == headB) { //둘이 정확히 같은 리스트면
            return headA; //리스트 둘중 아무거나 리턴
        }

     /*   if (headA.next == null) { //headA 원소가 하나라면
            stackA.push(headA); //하나만 넣고
        } else { //원소가 여러개면
            while (headA.next != null) {
                stackA.push(headA);
                headA = headA.next;
            }
        }*/

        while (headA != null) {
            stackA.push(headA);
            headA = headA.next;
        }

        while (headB != null) {
            stackB.push(headB);
            headB = headB.next;
        }

       /* if (headB.next == null) {
            stackB.push(headB);
        } else {
            while (headB.next != null) {
                stackB.push(headB);
                headB = headB.next;
            }
        }*/

        if (stackA.peek() != stackB.peek()) {
            return null;
        }else {
            while (stackA.peek() == stackB.peek()) {
                result = stackA.peek();
                stackA.pop();
                stackB.pop();
                if (stackA.isEmpty() || stackB.isEmpty()) {
                    return result;
                }
            }
        }
        return result;
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
