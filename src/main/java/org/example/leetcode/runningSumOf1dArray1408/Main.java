package org.example.leetcode.runningSumOf1dArray1408;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        //Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
        //
        //Return the running sum of nums.
        int[] case1 = {1,2,3,4};

        int[] case2 = {1,1,1,1,1};

        int[] case3 = {3,1,2,10,1};

        Arrays.stream(Solution.runningSum(case1)).asLongStream().forEach(n -> System.out.print(n +" "));
        System.out.println();
        Arrays.stream(Solution.runningSum(case2)).asLongStream().forEach(n -> System.out.print(n +" "));
        System.out.println();
        Arrays.stream(Solution.runningSum(case3)).asLongStream().forEach(n -> System.out.print(n +" "));

    }
}