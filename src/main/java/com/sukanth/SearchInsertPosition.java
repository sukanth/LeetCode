package com.sukanth;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]>= target){
                return i;
            }
        }
        return nums.length;
    }
    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int nums[] = {1,2,3,4,6,7,8,9};
        final int i = searchInsertPosition.searchInsert(nums, 5);
        System.out.println(i);
    }
}
