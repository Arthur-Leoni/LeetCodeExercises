package org.example.leetcode.jumpGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
        //
        //Return true if you can reach the last index, or false otherwise.

        int[] canJumpNums = {2,3,1,1,4}; // Can Jumnp

        int[] anottherTest = {2,5,0,0};// Can Not Jump

        int[] canNotJumpNums = {3,2,1,0,4};// Can Not Jump


        if (Solution.canJump(canJumpNums)){
            System.out.println("Can JUMP");
        } else {
            System.out.println("CaNot JUMP");
        };
    }
}