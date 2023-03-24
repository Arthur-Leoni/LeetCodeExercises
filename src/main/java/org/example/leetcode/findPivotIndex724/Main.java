package org.example.leetcode.findPivotIndex724;


public class Main {
    public static void main(String[] args) {
        //Given an array of integers nums, calculate the pivot index of this array.
        //
        //The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
        //
        //If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
        //
        //Return the leftmost pivot index. If no such index exists, return -1
        int[] case1 = {1,7,3,6,5,6};
        int[] case2 = {1,2,3};
        int[] case3 = {2,1,-1};

        System.out.print(Solution.pivotIndex(case1));
        System.out.println();
        System.out.print(Solution.pivotIndex(case2));
        System.out.println();
        System.out.print(Solution.pivotIndex(case3));


    }
}