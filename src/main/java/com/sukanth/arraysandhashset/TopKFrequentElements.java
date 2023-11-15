package com.sukanth.arraysandhashset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 *
 * Difficulty Level : Medium
 **************************************************************************************
 * Time Complexity : O(n)
 * Space Complexity : O(n)
 ***************************************************************************************
 * Youtube : https://www.youtube.com/watch?v=EBNPu0GgM64
 * Solution : https://github.com/nikoo28/java-solutions/blob/master/src/main/java/leetcode/medium/TopKFrequentElements.java
 * Question : https://leetcode.com/problems/top-k-frequent-elements/description/
 ***************************************************************************************
 */
public class TopKFrequentElements {
    public static void main(String[] args) {

        int[] nums = {3,8,2,2,1,1,3,5,6,7,7,7,7};
        int k = 2;

        int[] kFrequentNums = findKFrequentNums(nums, k);
        int[] kFrequentNumsOptimal = findKFrequentNumsOptimal(nums, k);
        System.out.println();
    }

    /**
     *
     * Time Complexity : O(nlogn)
     * Space Complexity : O(n)
     */
    private static int[] findKFrequentNums(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int inte:nums){
                hashMap.put(inte, hashMap.getOrDefault(inte,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> objects = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());

        for(Map.Entry entry: hashMap.entrySet()){
            objects.add(entry);
        }

        int[] output = new int[k];
        for(int i=0;i<k;i++){
            output[i] = objects.poll().getKey();
        }
        return output;
    }

    /**
     *
     * Time Complexity : O(n)
     * Space Complexity : O(n)
     * Youtube : https://www.youtube.com/watch?v=EBNPu0GgM64
     * Solution : https://github.com/nikoo28/java-solutions/blob/master/src/main/java/leetcode/medium/TopKFrequentElements.java
     * Question :
     */
    private static int[] findKFrequentNumsOptimal(int[] nums, int k) {
        HashMap<Integer, Integer> frequenciesMap = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length +1];
        for(int number : nums){
            frequenciesMap.put(number, frequenciesMap.getOrDefault(number,0) +1);
        }

        for(int key: frequenciesMap.keySet()){
            int frequency = frequenciesMap.get(key);
            if(bucket[frequency] == null){
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        int counter =0;
        int[] res = new int[k];

        for(int pos = bucket.length -1 ; pos >=0 && counter < k ;pos--) {
            if (bucket[pos] != null) {
                for (int num : bucket[pos]) {
                    res[counter++] = num;
                }
            }
        }
        return res;
    }

}
