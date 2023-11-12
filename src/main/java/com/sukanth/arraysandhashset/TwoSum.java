package com.sukanth.arraysandhashset;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] test ={1,2,2,3,3,4};
        final TwoSum twoSum = new TwoSum();
        final int[] ints = twoSum.twoSum(test, 5);
        for (int number :ints) {
            System.out.println(number);
        }
    }

    /**
     * Time Complexity - O(n)
     * Space Complexity - O(1) ?
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums,int target){
        if(nums == null || nums.length == 0){
            throw new IllegalArgumentException("list is empty");
        }
        Map<Integer,Integer> indexMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int compliment = target - nums[i];
            if(indexMap.get(compliment) !=null){
                return new int[]{indexMap.get(compliment),i};
            }
            indexMap.put(nums[i],i);
        }
        return new int[]{};
    }

    /**
     *  Time Complexity - O(n)
     *  Space Complexity - O(1)
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSumSorted(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("input invalid");
        }
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] == target) {
                return new int[]{i+1,j+1};
            } else if (nums[i] + nums[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[]{};
    }

    public int[] twoSumBruteForce(int[] nums,int target){
        for(int i=0;i< nums.length;i++){
            for(int j=i+1;j < nums.length;j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
