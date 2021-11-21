package linkedlist;


import java.util.ArrayList;
import java.util.List;

public class ListNode {
    int val;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    ListNode next;

    public ListNode() {
    }

    public ListNode(int x) {
        val = x;
        next = null;
    }

    @Override
    public String toString() {
        ListNode head = this;

        List<Integer> listNodes = new ArrayList<>();
        while (head != null) {
            listNodes.add(head.val);
            head = head.next;
        }
        return listNodes.toString();
    }
}
