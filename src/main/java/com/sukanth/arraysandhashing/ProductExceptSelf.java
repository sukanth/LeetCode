package com.sukanth.arraysandhashing;

import java.util.Arrays;

public class ProductExceptSelf {
    /**
     * Difficulty Level : Medium
     * <p>
     * ***********************************************************************************************
     * <p>
     * Question : https://leetcode.com/problems/product-of-array-except-self/
     * Solution : https://github.com/nikoo28/java-solutions/blob/master/src/main/java/leetcode/medium/ProductOfArrayExceptSelf.java
     * Explanation : https://www.youtube.com/watch?v=G9zKmhybKBM
     * <p>
     * ***********************************************************************************************
     * <p>
     * Time Complexity : O(n)
     * Space Complexity : O(n)
     * <p>
     * ***********************************************************************************************
     */
    public static void main(String[] args) {
        int input[] = {2,1,3,4};
        int [] result = productExceptSelf(input);
    }

    /**
     *
     * @param nums
     * @return
     *
     */
    private static int[]  productExceptSelf(int[] nums) {
        //Array to store all left multiplications
        int[] left = new int[nums.length];
        //Array to store all right multiplications
        int[] right = new int[nums.length];

        left[0] = 1;
        for(int i=1;i< nums.length;i++){
            left[i] = left[i-1] * nums[i-1];
        }

        right[nums.length - 1] = 1;
        for(int i= nums.length -2 ;i > -1;i--){
            right[i] = right[i+1] * nums[i+1];
        }

        int[] res = new int[nums.length];
        for(int i=0;i< nums.length;i++) {
            res[i] = left[i] * right[i];
        }
        return res;
    }
}
