package queue;

import java.util.LinkedList;
import java.util.Queue;

public class BuiltInQueue {
    public static void main(String[] args) {
        // 1. Initialize a queue.
        Queue<Integer> integerQueue = new LinkedList();
        // 2. Get the first element - return null if queue is empty.
        System.out.println("The first element is: " + integerQueue.peek());
        // 3. Push new element.
        integerQueue.offer(5);
        integerQueue.offer(13);
        integerQueue.offer(8);
        integerQueue.offer(6);
        System.out.println(integerQueue);
        // 4. Pop an element.
        integerQueue.poll();
        System.out.println(integerQueue);
        // 5. Get the first element.
        System.out.println("The first element is: " + integerQueue.peek());
        // 7. Get the size of the queue.
        System.out.println("The size is: " + integerQueue.size());
    }
}
