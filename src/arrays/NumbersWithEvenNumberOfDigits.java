package arrays;

public class NumbersWithEvenNumberOfDigits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (countNum(num) % 2 == 0) count++;
        }
        return count;
    }

    private static int countNum(int num) {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            ++count;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] input = {12, 345, 2, 6, 7896};
//        int[] input = {555,90,482,1771};
        System.out.println(findNumbers(input));
    }
}
