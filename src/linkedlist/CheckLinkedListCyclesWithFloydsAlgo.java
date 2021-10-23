package linkedlist;

public class CheckLinkedListCyclesWithFloydsAlgo {
    public static boolean hasCycle(ListNode head) {
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            head = head.next;
            fast = fast.next.next;
            if (fast == head) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        System.out.println(hasCycle());
    }
}
