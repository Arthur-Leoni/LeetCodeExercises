package org.example.leetcode.reverseInteger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
        // max number 2147483647
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = Solution.reverse(x);
        System.out.println("result: "+result);
    }
}