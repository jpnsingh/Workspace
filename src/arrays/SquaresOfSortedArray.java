package arrays;

import java.util.Arrays;

class SquaresOfSortedArray {
    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            nums[i] = n * n;
        }
        return Arrays.stream(nums).sorted().toArray();
    }

    public static void main(String[] args) {
        int[] input = {-7, -3, 2, 3, 11};
//        int[] input = {7, 3, 2, 3, 11};
        System.out.println(Arrays.toString(sortedSquares(input)));
    }
}
