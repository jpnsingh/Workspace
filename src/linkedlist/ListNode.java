package linkedlist;


import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int x) {
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

