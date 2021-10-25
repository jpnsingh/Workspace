package linkedlist;

public class ReverseListBetweenRecursive {
    private static boolean stop;
    private static ListNode left;

    private static void recurseAndReverse(ListNode right, int m, int n) {
        if (n == 1) {
            return;
        }

        right = right.next;

        if (m > 1) {
            left = left.next;
        }

        recurseAndReverse(right, m - 1, n - 1);

        if (left == right || right.next == left) {
            stop = true;
        }

        if (!stop) {
            int t = left.val;
            left.val = right.val;
            right.val = t;

            left = left.next;
        }
    }

    public static ListNode reverseBetween(ListNode head, int m, int n) {
        left = head;
        stop = false;
        recurseAndReverse(head, m, n);
        return head;
    }

    public static void main(String[] args) {
        final int left = 2, right = 5;
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(5);
        head.next.next.next = new ListNode(7);
        head.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next = new ListNode(11);

        System.out.println(reverseBetween(head, left, right));
    }
}
