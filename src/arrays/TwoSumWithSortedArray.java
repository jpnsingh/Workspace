package arrays;

import java.util.Arrays;

public class TwoSumWithSortedArray {
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            int sumStartEnd = numbers[start] + numbers[end];
            if (sumStartEnd == target) {
                result[0] = start + 1;
                result[1] = end + 1;
                break;
            } else if (sumStartEnd > target) {
                end--;
            } else {
                start++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int target = 9;
        int[] nums = {2, 7, 11, 15};
//        int[] nums = {1, 2, 7, 11, 15};
//        int[] nums = {1, 2, 5, 7, 11, 15};

//        int target = 6;
//        int[] nums = {2, 3, 4};

//        int target = -1;
//        int[] nums = {-1, 0};
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
