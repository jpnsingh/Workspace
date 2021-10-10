package linkedlist;

public class MyLinkedList {
    int size;
    private ListNode head;

    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        ListNode currentNode = head;

        for (int i = 0; i < index + 1; i++) {
            currentNode = currentNode.next;
        }

        return currentNode.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }

        if (index < 0) {
            index = 0;
        }

        ++size;

        ListNode previousNode = head;

        for (int i = 0; i < index; ++i) {
            previousNode = previousNode.next;
        }

        ListNode nodeToAdd = new ListNode(val);
        nodeToAdd.next = previousNode.next;
        previousNode.next = nodeToAdd;

    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }

        size--;
        ListNode previousNode = head;
        for (int i = 0; i < index; ++i) {
            previousNode = previousNode.next;
        }
        previousNode.next = previousNode.next.next;
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        System.out.println(myLinkedList.toString());
        myLinkedList.addAtTail(3);
        System.out.println(myLinkedList.toString());
        myLinkedList.addAtIndex(1, 2);
        System.out.println(myLinkedList.toString());
        System.out.println(myLinkedList.get(1));
        myLinkedList.deleteAtIndex(1);
        System.out.println(myLinkedList.toString());
        System.out.println(myLinkedList.get(1));
    }

    static class ListNode {
        private int val;
        private ListNode next;

        ListNode(int value) {
            this.val = value;
        }
    }
}
