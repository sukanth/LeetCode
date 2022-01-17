package com.sukanth;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {3, 4, 5};
        final int[] ints = mergeTwoSortedArrays(nums1, 3, nums2, 3);
        Arrays.stream(ints).forEach(s -> System.out.println(s));
        
    }

    /**
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    private static int[] mergeTwoSortedArrays(int[] nums1, int m, int[] nums2, int n) {
        //copy nums1 to nums1copy
        int[] nums1copy = new int[m];
        for (int i = 0; i < m; i++) {
            nums1copy[i] = nums1[i];
        }

        //initialize two read pointers and one write pointer

        int p1 = 0;
        int p2 = 0;

        for (int p = 0; p < m + n; p++) {
            if (p2>=n || p1<m && nums1copy[p1]<nums2[p2]) {
                nums1[p] = nums1copy[p1++];
            } else {
                nums1[p] = nums2[p2++];
            }
        }
        return nums1;
    }
}
