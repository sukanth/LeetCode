package com.sukanth.twopointers;

/**
 * Difficulty : Easy
 * Youtube : https://www.youtube.com/watch?v=UXVHeXNO9AA
 * Leetcode : https://leetcode.com/problems/valid-palindrome/description/
 *
 * TimeComplexity : O(n)
 * SpaceComplexity : O(1)
 *
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        int x = -121;
        System.out.println(isValidPalindrome(s));
        System.out.println(isValidPalindrome(x));
    }

    private static boolean isValidPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left <= right) {
            char currLeft = s.charAt(left);
            char currRight = s.charAt(right);
            if (!Character.isLetterOrDigit(currLeft)) {
                left++;
            } else if (!Character.isLetterOrDigit(currRight)) {
                right--;
            } else {
                if (Character.toLowerCase(currLeft) != Character.toLowerCase(currRight)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }

    private static boolean isValidPalindrome(int x) {
        String s = Integer.toString(x);
        int left = 0;
        int right = s.length() - 1;

        while(left <= right){
            char currLeft = s.charAt(left);
            char currRight = s.charAt(right);
            if(!Character.isLetterOrDigit(currLeft)){
                left++;
            }else if(!Character.isLetterOrDigit(currRight)){
                right--;
            }else{
                if(Character.toLowerCase(currLeft) != Character.toLowerCase(currRight)){
                    return false;
                }
                left++;
                right--;
            }
        }
        return false;
    }

    public boolean isPalindrome1(String s){
        int left = 0;
        int right = s.length() -1 ;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }else {
                left++;
                right--;
            }
        }
        return true;
    }
}

