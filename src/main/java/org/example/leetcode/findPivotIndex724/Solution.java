package org.example.leetcode.findPivotIndex724;

public class Solution {
        public static int pivotIndex(int[] nums) {
                for (int c = 0; c < nums.length; c++) {
                        int sumLeft = 0;
                        int sumRight = 0;
                        int range = 0;

                        while (c-range >= 0 || c+range <= nums.length) {
                                if(c-range >= 0) {
                                        sumLeft = nums[c-range] + sumLeft;
                                }
                                if(c+range <= nums.length-1) {
                                        sumRight = nums[c+range] + sumRight;;
                                }
                                range++;
                        }

                        if(sumLeft == sumRight){

                                return c;
                        }
                }
                return -1;
        }
}