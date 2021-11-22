package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class MovingAverageWithDeque {
    private final int windowSize;
    private int windowSum = 0;
    private int queueSize = 0;
    Deque<Integer> queue = new ArrayDeque<>();

    public MovingAverageWithDeque(int windowSize) {
        this.windowSize = windowSize;
    }

    public double next(int tail) {
        queue.add(tail);
        int head = ++queueSize > windowSize ? queue.poll() : 0;
        windowSum = -head + windowSum + tail;

        return (windowSum * 1.0) / Math.min(windowSize, queueSize);
    }

    public static void main(String[] args) {
        MovingAverageWithDeque movingAverage = new MovingAverageWithDeque(3);
        System.out.println(movingAverage.next(1)); // return 1.0 = 1 / 1
        System.out.println(movingAverage.next(10)); // return 5.5 = (1 + 10) / 2
        System.out.println(movingAverage.next(3)); // return 4.66667 = (1 + 10 + 3) / 3
        System.out.println(movingAverage.next(5)); // return 6.0 = (10 + 3 + 5) / 3
    }
}
