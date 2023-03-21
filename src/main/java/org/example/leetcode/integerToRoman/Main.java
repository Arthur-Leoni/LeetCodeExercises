package org.example.leetcode.integerToRoman;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
        // 1 <= num <= 3999
        int x = 1;
        while(x != 0) {
            Scanner sc = new Scanner(System.in);
            int roman = sc.nextInt();
            System.out.println(Solution.intToRoman(roman));
        }
    }
}