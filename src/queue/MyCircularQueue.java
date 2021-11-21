package queue;

import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

public class MyCircularQueue {

    private int[] data;
    private int size;
    private int head;
    private int tail;

    private final ReentrantLock queueLock = new ReentrantLock();

    public MyCircularQueue(int size) {
        this.data = new int[size];
        this.size = size;
        this.head = -1;
        this.tail = -1;
    }

    public boolean enQueue(int val) {
        queueLock.lock();
        try {
            if (isFull()) {
                return false;
            }

            if (isEmpty()) {
                head = 0;
            }

            tail = (tail + 1) % size;
            data[tail] = val;
        } finally {
            queueLock.unlock();
        }

        return true;
    }

    public boolean deQueue() {
        queueLock.lock();
        try {
            if (isEmpty()) {
                return false;
            }

            if (head == tail) {
                head = -1;
                tail = -1;
                return true;
            }

            head = (head + 1) % size;
        } finally {
            queueLock.unlock();
        }
        return true;
    }

    public int front() {
        return isEmpty() ? -1 : data[head];
    }

    public int rear() {
        return isEmpty() ? -1 : data[tail];
    }

    public boolean isEmpty() {
        return head == -1;
    }

    public boolean isFull() {
        return (tail + 1) % size == head;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
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
