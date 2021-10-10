package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> complimentLookup = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            complimentLookup.put(num, i);
        }
        System.out.println(complimentLookup);
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            System.out.println(compliment);
            if (complimentLookup.containsKey(compliment) && i != complimentLookup.get(compliment)) {
                result[0] = i;
                result[1] = complimentLookup.get(compliment);
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        int[] nums = {2, 7, 11, 15};
//        int[] nums = {1, 2, 7, 11, 15};
//        int[] nums = {1, 2, 5, 7, 11, 15};
//        int target = 9;
        int target = 6;
        int[] nums = {3, 2, 4};
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
