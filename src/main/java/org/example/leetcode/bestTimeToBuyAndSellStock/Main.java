package org.example.leetcode.bestTimetoBuyAndSellStock;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //You are given an array prices where prices[i] is the price of a given stock on the ith day.
        //
        //You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
        //
        //Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

        int [] prices = {7,1,5,3,6,4};
        int [] prices2 = {7,6,4,3,1};

        System.out.println(Solution.maxProfit(prices));
    }
}