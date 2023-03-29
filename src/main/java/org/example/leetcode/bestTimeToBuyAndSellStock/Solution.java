package org.example.leetcode.bestTimetoBuyAndSellStock;

public class Solution {
        public static int maxProfit(int[] prices) {
                int max = 0;
                int min = Integer.MAX_VALUE;

                for(int c1 = 0; c1 < prices.length; c1++) {
                        if(prices[c1] < min){
                                min = prices[c1];
                        } else if (prices[c1] - min > max) {
                                max = prices[c1] - min;
                        }
                }

                return max;
        }
}