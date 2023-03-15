package org.example.leetcode.PalindromeNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Given an integer x, return true if x is a palindrome, and false otherwise.
        //Follow up: Could you solve it without converting the integer to a string?
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isPalindrome = Solution.isPalindrome(number);
        System.out.println("Is this number a palindrome: "+isPalindrome);
    }
}