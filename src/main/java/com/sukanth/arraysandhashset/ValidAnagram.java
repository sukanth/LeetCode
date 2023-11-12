package com.sukanth.arraysandhashset;

import java.util.HashMap;

/**
 * Difficulty Level : Easy
 * ************************************************************
 * <p>
 * Question : https://leetcode.com/problems/valid-anagram/
 * Solution : https://github.com/neetcode-gh/leetcode/blob/main/java/0242-valid-anagram.java
 * Youtube : https://www.youtube.com/watch?v=IRN1VcA8CGc
 * ************************************************************
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * <p>
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "rat", t = "car"
 * Output: false
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length, t.length <= 5 * 104
 * s and t consist of lowercase English letters.
 */
public class ValidAnagram {
    public static void main(String[] args) {
        final String a = "anagram";
        final String b = "nagaram";

        final String c = "anagram#1";
        final String d = "nagaram#1";
        System.out.println(isAnagram(c, d));
        System.out.println(checkAnagram(a, b));
    }

    /**
     * This only works if we have lower case alphabet letters
     * Time Complexity : O(s + char_counts)
     * Space Complexity : O(char_counts)
     */
    public static boolean checkAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] char_counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char_counts[s.charAt(i) - 'a']++;
            char_counts[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < char_counts.length; i++) {
            if (char_counts[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
     * Time Complexity = o(n)
     * Sapce Complexity = 0(m+n)
     */
    public static boolean isAnagram(final String s, final String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            sMap.put(s.charAt(i), (sMap.getOrDefault(s.charAt(i), 0)) + 1);
            tMap.put(t.charAt(i), (tMap.getOrDefault(t.charAt(i), 0)) + 1);
        }
        return sMap.equals(tMap);
    }
}