package org.example.leetcode.IsomorphicStrings205;


public class Main {
    public static void main(String[] args) {
        //Given two strings s and t, determine if they are isomorphic.
        //
        //Two strings s and t are isomorphic if the characters in s can be replaced to get t.
        //
        //All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

        System.out.println(Solution.isIsomorphic("egg", "add"));
        System.out.println(Solution.isIsomorphic("foo", "bar"));
        System.out.println(Solution.isIsomorphic("paper", "title"));
        System.out.println(Solution.isIsomorphic("abcdefghijklmnopqrstuvwxyzva", "abcdefghijklmnopqrstuvwxyzck"));


    }
}