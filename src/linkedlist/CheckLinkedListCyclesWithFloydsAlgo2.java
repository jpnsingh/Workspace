package linkedlist;

public class CheckLinkedListCyclesWithFloydsAlgo2 {
    public static ListNode getIntersection(ListNode head) {
        ListNode tortoise = head;
        ListNode hare = head;

        while (hare != null && hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;
            if (tortoise == hare) {
                return tortoise;
            }
        }

        return null;
    }

    public static ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode intersect = getIntersection(head);
        if (intersect == null) {
            return null;
        }

        ListNode ptr1 = head;
        ListNode ptr2 = intersect;

        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        return ptr2;
    }

    public static void main(String[] args) {
//        System.out.println(hasCycle());
    }
}
