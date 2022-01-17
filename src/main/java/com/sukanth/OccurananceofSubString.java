package com.sukanth;

import java.util.HashMap;
import java.util.Map;

public class OccurananceofSubString {
    public static void main(String[] args) {
        String testString = "abcabcgfdabc";
        findOccurancesOfSubString(testString, 3, 3, 4);

    }

    private static String findOccurancesOfSubString(String testString, int maxUniqueLetters, int minCount, int maxCount) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < testString.length() - minCount + 1; i++) {
            String subString = testString.substring(i, minCount + i);
            if(isValidSubString(subString, maxUniqueLetters)){
                map.put(subString,map.getOrDefault(subString,0)+1);
            }
        }
        int max = 0;
        for (int val:map.values()) {
            max = Math.max(max,val);
        }
        String result = null;
        for (String key: map.keySet()) {
            if(map.get(key).equals(max)){
                result = key;
            }
        }
        return result;
    }

    private static boolean isValidSubString(String subString, int maxUniqueLetters) {
        Map<Character, Integer> noOfOccurancesOfCharMap = new HashMap<>();
        for (char character : subString.toCharArray()) {
            noOfOccurancesOfCharMap.put(character, noOfOccurancesOfCharMap.getOrDefault(character, 0) + 1);
        }
        return noOfOccurancesOfCharMap.size() <= maxUniqueLetters ? true : false;
    }
}
