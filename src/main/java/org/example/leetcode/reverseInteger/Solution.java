package org.example.leetcode.reverseInteger;

public class Solution {
        public static int reverse(int x) {
                int numberToReverse = x;
                long reversedInt = 0;
                while (numberToReverse != 0) {
                        int digit = numberToReverse % 10;
                        reversedInt = reversedInt * 10 + digit;
                        numberToReverse /= 10;
                }
                if(reversedInt < -Math.pow(2,31) || reversedInt > Math.pow(2,31)) {
                        return 0;
                }

                return Math.toIntExact(reversedInt);
        }
}
