package queue;

import linkedlist.ListNode;

public class MyCircularQueueUsingLinkedList {

    private ListNode head;
    private ListNode tail;
    private int capacity;
    private int count;

    public MyCircularQueueUsingLinkedList(int capacity) {
        this.capacity = capacity;
    }

    public boolean enQueue(int val) {
        if (isFull()) {
            return false;
        }

        ListNode newNode = new ListNode(val);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        this.count++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }

        this.head = this.head.getNext();
        this.count--;
        return true;
    }

    public int front() {
        return isEmpty() ? -1 : head.getVal();
    }

    public int rear() {
        return isEmpty() ? -1 : tail.getVal();
    }

    public boolean isEmpty() {
        return this.count == 0;
    }

    public boolean isFull() {
        return this.count == this.capacity;
    }

    @Override
    public String toString() {
        return head.toString();
    }

    public static void main(String[] args) {
        MyCircularQueueUsingLinkedList myCircularQueue = new MyCircularQueueUsingLinkedList(3);
        System.out.println(myCircularQueue.enQueue(1));     // return true
        System.out.println(myCircularQueue.enQueue(2));     // return true
        System.out.println(myCircularQueue.enQueue(3));     // return true
        System.out.println(myCircularQueue);
        System.out.println(myCircularQueue.enQueue(4));     // return false
        System.out.println(myCircularQueue.rear());            // return 3
        System.out.println(myCircularQueue.isFull());          // return true
        System.out.println(myCircularQueue.deQueue());         // return true
        System.out.println(myCircularQueue.enQueue(4));     // return true
        System.out.println(myCircularQueue);
        System.out.println(myCircularQueue.rear());            // return 4
    }
}
