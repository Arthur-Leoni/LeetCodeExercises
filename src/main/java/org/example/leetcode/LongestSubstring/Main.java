package org.example.leetcode.LongestSubstring;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Given a string s, find the length of the longest substring without repeating characters
        Scanner sc = new Scanner(System.in);
        String text  = sc.next();
        System.out.println("the length of the longest substring is: "+Solution.lengthOfLongestSubstring(text));
    }
}