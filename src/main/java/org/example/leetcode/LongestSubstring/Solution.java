package org.example.leetcode.LongestSubstring;

public class Solution {
        public static int lengthOfLongestSubstring(String s) {
                String longestSubstring = "";
                String substring = "";
                boolean containsNewChar = false;
                char newChar = 0;

               for(int c = 0; c < s.length(); c++ ){
                       System.out.println(c);
                       newChar =  s.charAt(c);
                       containsNewChar = substring.contains(Character.toString(newChar));
                       substring = substring + newChar;
                       if (!containsNewChar || c == s.length()-1){
                          if (substring != null && substring.length() > longestSubstring.length())   {
                                  longestSubstring = substring;
                          }
                       } else {
                               substring = "";
                       }
               }
               return longestSubstring.length();
        }
}