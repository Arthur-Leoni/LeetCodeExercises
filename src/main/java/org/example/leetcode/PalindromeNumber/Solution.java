package org.example.leetcode.PalindromeNumber;

public class Solution {
        public static boolean isPalindrome(int informedNumber) {
                if(informedNumber < 0) {
                        return false;
                }
                int numberToReverse = informedNumber;
                int reversedInt = 0;
                while (numberToReverse != 0) {
                        int digit = numberToReverse % 10;
                        reversedInt = reversedInt * 10 + digit;
                        numberToReverse /= 10;
                }
                return (informedNumber == reversedInt) ? true : false;
        }
}
