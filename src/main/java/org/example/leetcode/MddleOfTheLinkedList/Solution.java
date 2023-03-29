package org.example.leetcode.MddleOfTheLinkedList;

public class Solution {
        public static ListNode middleNode(ListNode head) {
                ListNode next =head;
                ListNode result =head;
                int count =0;
                while (next != null) {
                        next = next.next;
                        count++;
                }

                count = (count/2);
                while(count != 0){
                        result = result.next;
                        count--;
                }
                return result;
        }
}