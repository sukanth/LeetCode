package com.sukanth.arraysandhashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 *************************************************************************************************
 * Difficulty Level : Medium
 ************************************************************************************************
 * Time complexity: O(N * K * log(K))
 * Space complexity: O(N * K)
 *************************************************************************************************
 *  Question : https://leetcode.com/problems/group-anagrams/
 *  Answer : https://github.com/neetcode-gh/leetcode/blob/main/java/0049-group-anagrams.java
 *  Youtube : https://www.youtube.com/watch?v=vzdNOK2oB2E
 * ************************************************************************************************
 */

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strings = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = groupAnagrams(strings);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0){
            return new ArrayList<>();
        }
        HashMap<String, List<String>> groupAnagrams = new HashMap<>();
        for(String string:strs){
            char[] charArray = string.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            if(!groupAnagrams.containsKey(sortedString)){
                groupAnagrams.put(sortedString,new ArrayList<>());
            }
            groupAnagrams.get(sortedString).add(string);
        }
        return new ArrayList<>(groupAnagrams.values());
    }

}
