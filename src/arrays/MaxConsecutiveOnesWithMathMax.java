package arrays;

public class MaxConsecutiveOnesWithMathMax {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                max = Math.max(count, max);
                count = 0;
            }
        }
        return Math.max(count, max);
    }

    public static void main(String[] args) {
        int[] input = {1, 0, 1, 1, 0, 1};
//        int[] input = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(input));
    }
}
