package org.example.leetcode.isSubsequence392;

public class Solution {
        public static boolean isSubsequence(String s, String t) {
                StringBuilder validator = new StringBuilder();
                int lastPosition = -1;
                for(int sIterator = 0; sIterator < s.length(); sIterator++){
                        char sChar = s.toCharArray()[sIterator];
                        for(int tIterator = 0; tIterator < t.length(); tIterator++){
                                char tChar = t.toCharArray()[tIterator];
                                if(sChar == tChar && tIterator > lastPosition){
                                        lastPosition = tIterator;
                                        validator.append(tChar);
                                        break;
                                }

                        }
                }
                return validator.toString().equals(s);
        }

}