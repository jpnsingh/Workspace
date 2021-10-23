package linkedlist;

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        int carry = 0;
        ListNode p = l1;
        ListNode q = l2;
        ListNode current = result;

        while (p != null || q != null) {
            int x = p != null ? p.val : 0;
            if (p != null) {
                p = p.next;
            }
            int y = q != null ? q.val : 0;
            if (q != null) {
                q = q.next;
            }
            int sum = carry + x + y;
            carry = sum / 10;
            sum = sum % 10;
            current.next = new ListNode(sum);
            current = current.next;
        }

        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return result.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        System.out.println(addTwoNumbers(l1, l2));
    }
}
