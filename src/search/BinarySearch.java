package search;

public class BinarySearch {
    public static boolean searchAndReturnBoolean(int[] nums, int searchNum) {
        int len = nums.length;
        int start = 0;
        int end = len - 1;

        for (int i = 0; i < nums.length; i++) {
            int midIndex = nums.length / 2;
            int midValue = nums[midIndex];

            if (searchNum == midValue) {
                return true;
            } else {
                if (searchNum < midValue) {
                    end = midIndex - 1;
                } else {
                    start = midIndex + 1;
                }
            }
        }
        return false;
    }

    public static int searchAndReturnIndex(int[] nums, int searchNum) {
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 23, 43, 75, 77, 88, 99, 100, 110, 112};
        int searchNum = 75;

        System.out.println(searchAndReturnBoolean(nums, searchNum));
        System.out.println(searchAndReturnIndex(nums, searchNum));
    }
}
