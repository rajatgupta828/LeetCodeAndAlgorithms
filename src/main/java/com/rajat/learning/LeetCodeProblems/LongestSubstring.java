package com.rajat.learning.LeetCodeProblems;

import java.util.HashSet;
import java.util.Set;

/**
 * This is a Question where we have to get a longest substring without repeating characters
 * Algorithm Used  : Sliding window
 */

public class LongestSubstring {

    public static void main(String[] args) {
        String s = "aaddbbhhd";

        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }else {
            int i = 0, j = 0, max = 0;
            Set<Character> mySet = new HashSet<>();
            while(i < s.length()) {
                char c = s.charAt(i);
                while (mySet.contains(c)){
                    mySet.remove(s.charAt(j));
                    ++j;
                }
                mySet.add(c);
                max = Math.max(max, i - j +1);
                ++i;
            }
            return max;
        }

    }
}
