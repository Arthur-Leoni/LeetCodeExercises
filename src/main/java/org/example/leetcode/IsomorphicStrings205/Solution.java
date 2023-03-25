package org.example.leetcode.IsomorphicStrings205;

import java.util.HashMap;
import java.util.Map;

public class Solution {
        public static boolean isIsomorphic(String s, String t) {
                if (s.length() != t.length()) {
                        return false;
                }

                if(extractStringStruture(s).equals(extractStringStruture(t))) {
                        return true;
                } else {
                        return false;
                }
        }

        private static String extractStringStruture(String stringToExtract) {
                Map<Character, Integer> usedChars = new HashMap<>();
                int numberToAdd = 0;
                StringBuilder validator = new StringBuilder();

                for(char c: stringToExtract.toCharArray()){
                       if (!usedChars.containsKey(c)){
                               usedChars.put(c, numberToAdd);
                               validator.append(numberToAdd);
                               numberToAdd++;
                       } else {
                               validator.append(usedChars.get(c));
                               validator.append(",");
                       }

                }
                System.out.println(validator);
                return validator.toString();
        }

}