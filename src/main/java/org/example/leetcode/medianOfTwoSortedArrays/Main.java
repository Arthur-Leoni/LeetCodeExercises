package org.example.leetcode.medianOfTwoSortedArrays;

public class Main {
    public static void main(String[] args) {
        //Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
        //
        //The overall run time complexity should be O(log (m+n)).
        int[] nums1 = new int[] {1,2};
        int[] nums2 = new int[] {3,4};

        System.out.println("Median of the two sorted arrays is: "+ Solution.findMedianSortedArrays(nums1, nums2));
    }
}