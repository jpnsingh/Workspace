package arrays;

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int temp = 0;

        for (int num : nums) {
            if (num == 1) {
                temp++;
            } else if (num == 0) {
                temp = 0;
            }
            if (temp > max) {
                max = temp;
            }
        }

        return max;
    }

    public static void main(String[] args) {
//        int[] input = {1, 0, 1, 1, 0, 1};
        int[] input = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(input));
    }
}
