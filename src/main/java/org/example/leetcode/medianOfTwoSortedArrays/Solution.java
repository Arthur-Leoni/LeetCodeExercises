package org.example.leetcode.medianOfTwoSortedArrays;

import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class Solution {
        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
                Stream<Integer> stream = Stream.concat(stream(nums1).boxed(), stream(nums2).boxed()).sorted();
                Object[] objects = stream.toArray();
                int streamLength = objects.length;
                double result = 0;
                if(streamLength % 2 != 1) {
                        int n1 = (int) objects[(streamLength / 2) - 1];
                        int n2 = (int) objects[(streamLength / 2)];
                        result = (n1 + n2) / 2.0;
                } else {
                        result = (int) objects[(streamLength/2)];
                }

                return result;
        }

}