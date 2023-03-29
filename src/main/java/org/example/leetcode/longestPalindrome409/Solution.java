package org.example.leetcode.longestPalindrome409;

import java.util.Arrays;

public class Solution {
        public static int longestPalindrome(String s) {
                char[] chars = s.toCharArray();
                Arrays.sort(chars);
                int pairChars=0;
                int soloChars=0;
                int palimdromeSize = 0;
                int c = 0;
                while (c != s.length()){
                        if(c+1 != s.length() && chars[c] == chars[c+1]){
                                palimdromeSize = palimdromeSize +2;
                                pairChars = pairChars + 2;
                                c++;
                        } else {
                                soloChars++;
                        }
                        c++;
                 }
                if(soloChars>0){
                        palimdromeSize = pairChars +1;
                } else {
                        palimdromeSize = pairChars;
                }

                return palimdromeSize;
        }

}