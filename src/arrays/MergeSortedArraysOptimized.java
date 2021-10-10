package arrays;

import java.util.Arrays;

public class MergeSortedArraysOptimized {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1Copy = new int[m];
        for (int i = 0; i < m; i++) {
            nums1Copy[i] = nums1[i];
        }

        int p1 = 0;
        int p2 = 0;

        for (int p = 0; p < m + n; p++) {
            if (p2 >= n || (p1 < m && nums1Copy[p1] < nums2[p2])) {
                nums1[p] = nums1Copy[p1];
                p1++;
            } else {
                nums1[p] = nums2[p2];
                p2++;
            }
        }
    }

    public static void main(String[] args) {
//        int[] nums1 = {1, 2, 3, 0, 0, 0};
//        int m = 3;
//        int[] nums2 = {2, 5, 6};
//        int n = 3;

//        int[] nums1 = {1};
//        int m = 1;
//        int[] nums2 = {};
//        int n = 0;

        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        merge(nums1, m, nums2, n);
    }
}

