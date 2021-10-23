package linkedlist;

public class MiddleNodeWithArray {
    public static ListNode middleNode(ListNode head) {
        ListNode[] listNodes = new ListNode[100];
        int t = 0;
        while (head != null) {
            listNodes[t++] = head;
            head = head.next;
        }
        System.out.println(t);
        return listNodes[t / 2];
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode middleNode = middleNode(head);
        System.out.println(middleNode);
    }
}
