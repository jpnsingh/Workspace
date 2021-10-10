package arrays;

import java.util.Arrays;

class SquaresOfSortedArrayTwoPointers {
    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            int LeftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if (LeftSquare < rightSquare) {
                result[i] = rightSquare;
                right--;
            } else {
                result[i] = LeftSquare;
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = {-7, -3, 2, 3, 11};
//        int[] input = {7, 3, 2, 3, 11};
        System.out.println(Arrays.toString(sortedSquares(input)));
    }
}
