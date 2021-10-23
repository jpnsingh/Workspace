package linkedlist;


import java.util.HashSet;
import java.util.Set;

public class CheckLinkedListCyclesWithHashTable {
    public static boolean hasCycle(ListNode head) {
        Set<ListNode> listNodes = new HashSet<>();

        while (head != null) {
            if (listNodes.contains(head)) {
                return true;
            }
            listNodes.add(head);
            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {
//        System.out.println(hasCycle());
    }
}
