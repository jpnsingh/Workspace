package queue;

import java.util.ArrayList;
import java.util.List;

public class MovingAverage {
    private int size;
    List<Integer> queue = new ArrayList<>();

    public MovingAverage(int size) {
        this.size = size;
    }

    public double next(int val) {
        queue.add(val);

        int slidingWindowSum = 0;
        for (int i = Math.max(0, queue.size() - size); i < queue.size(); ++i) {
            slidingWindowSum += queue.get(i);
        }

        return (slidingWindowSum * 1.0) / Math.min(queue.size(), size);
    }

    public static void main(String[] args) {
        MovingAverage movingAverage = new MovingAverage(3);
        System.out.println(movingAverage.next(1)); // return 1.0 = 1 / 1
        System.out.println(movingAverage.next(10)); // return 5.5 = (1 + 10) / 2
        System.out.println(movingAverage.next(3)); // return 4.66667 = (1 + 10 + 3) / 3
        System.out.println(movingAverage.next(5)); // return 6.0 = (10 + 3 + 5) / 3
    }
}
