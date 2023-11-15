package com.sukanth.arraysandhashing;

import java.util.HashSet;

/**
 * Difficulty Level : Easy
 * <p>
 * ***********************************************************************************************
 * <p>
 * Question : https://leetcode.com/problems/contains-duplicate/
 * Solution : https://github.com/neetcode-gh/leetcode/blob/main/java/0217-contains-duplicate.java
 * Explanation : https://www.youtube.com/watch?v=3OamzN90kPg
 * <p>
 * ***********************************************************************************************
 * <p>
 * Time Complexity : O(n)
 * Space Complexity : O(n)
 * <p>
 * ***********************************************************************************************
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 4, 5, 6};
        System.out.println(containsDuplicate(nums));
    }

    private static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> uniqueNums = new HashSet<>();
        for (Integer num : nums) {
            if (uniqueNums.contains(num)) {
                return true;
            }
            uniqueNums.add(num);
        }
        return false;
    }
}
