package queue;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyQueue {

    private List<Integer> data;
    private int head;

    public MyQueue() {
        this.data = new ArrayList<>();
        this.head = 0;
    }

    public boolean enQueue(int x) {
        data.add(x);
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        head++;
        return true;
    }

    private int front() {
        return data.get(head);
    }

    private boolean isEmpty() {
        return head >= data.size();
    }

    @Override
    public String toString() {
        return "[" + data.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enQueue(5);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(6);
        if (!queue.isEmpty()) {
            System.out.println("Queue: " + queue);
            System.out.println("Front: " + queue.front());
        }
        queue.deQueue();
        if (!queue.isEmpty()) {
            System.out.println("Front: " + queue.front());
        }
        queue.deQueue();
        if (!queue.isEmpty()) {
            System.out.println("Front: " + queue.front());
        }
    }
}
