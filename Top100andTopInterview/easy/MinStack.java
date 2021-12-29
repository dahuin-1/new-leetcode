package Top100andTopInterview.easy;

import java.util.ArrayList;
import java.util.List;

public class MinStack {

    List<List<Integer>> stack;
    private Node head;

    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(2);
        obj.push(1);
        obj.push(3);
        obj.push(1);
        System.out.println("min" + obj.getMin());
        obj.pop();
        System.out.println("min" + obj.getMin());
        obj.pop();
        System.out.println("min" + obj.getMin());//2???????
        obj.pop();
        System.out.println("min" + obj.getMin());
    }

    /**
     * initialize your data structure here.
     */

    public MinStack() {
        stack = new ArrayList<>();
    }

    public void push(int val) {
        if (head == null)
            head = new Node(val, val, null);
        else
            head = new Node(val, Math.min(val, head.min), head); //val, min, next
    }

    public void pop() {
        head = head.prev;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }

    private class Node {
        int val;
        int min;
        Node prev;

        private Node(int val, int min, Node prev) {
            this.val = val;
            this.min = min;
            this.prev = prev;
        }
    }
}

/*
private Node head;

    public void push(int x) {
        if (head == null)
            head = new Node(x, x, null);
        else
            head = new Node(x, Math.min(x, head.min), head);
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }

    private class Node {
        int val;
        int min;
        Node next;

        private Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
 */
