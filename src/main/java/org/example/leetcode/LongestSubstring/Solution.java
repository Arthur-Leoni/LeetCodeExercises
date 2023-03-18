package org.example.leetcode.LongestSubstring;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        String longestSubstring = "";
        String actualString = "";
        boolean containsNewChar = false;
        char newChar = 0;

        for(int c = 0; c != s.length(); c++ ){
            System.out.println(c+" "+ s.charAt(c));
            newChar =  s.charAt(c);
            containsNewChar = isContainsNewChar(actualString, newChar);
            actualString = actualString + newChar;
            if (!containsNewChar){
                if (actualString != null && actualString.length() > longestSubstring.length())   {
                    longestSubstring = actualString;
                }
            } else {
                actualString = cleanString(actualString, newChar);
            }
        }
        return longestSubstring.length();
    }

    private static boolean isContainsNewChar(String substring, char newChar) {
        return substring.contains(Character.toString(newChar));
    }

    private static String cleanString(String actualString, char newChar) {
        while (!containsOnlyOneChar(actualString, newChar) && isContainsNewChar(actualString, newChar) && actualString.length()>1) {
            actualString = actualString.substring(1);
        }
        return actualString;
    }

    public static boolean containsOnlyOneChar(String substring, char newChar) {
        int count =0;
        for (int i = 0; i < substring.length(); i++) {
            if (substring.charAt(i) == newChar) {
                count++;
            }
        }
        return (count > 1) ? false : true;
    }
}