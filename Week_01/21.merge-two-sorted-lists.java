/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

 // 1. two pointers
 // 2. recursion (feedback)
 /*
  * every time when we compare the values of 2 nodes, we will choose the smaller one.
  * In this sense, node.next would be the node that is the smaller one between the next pairs of nodes.
  * It is, therefore, a recursive scenario, where we are bascially comparing next available nodes from two linkedList.
  */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        // recursion
        // if (l1 == null) {
        //     return l2;
        // } else if (l2 == null) {
        //     return l1;
        // } else if (l1.val <= l2.val) {
        //     l1.next = mergeTwoLists(l1.next, l2);
        //     return l1;
        // } else {
        //     l2.next = mergeTwoLists(l1, l2.next);
        //     return l2;
        // }

        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }

        ListNode dummy = new ListNode(-1); 
        ListNode resCur = dummy;
        ListNode c1 = l1;
        ListNode c2 = l2;


        while (c1 != null && c2 != null) {

            if (c1.val <= c2.val) {
                resCur.next = c1;
                c1 = c1.next;
            } else {
                resCur.next = c2;
                c2 = c2.next;
            }

            resCur = resCur.next;
        }

        if (c1 != null) {
            resCur.next = c1;
        }

        if (c2 != null) {
            resCur.next = c2;
        }
        

        return dummy.next;


    }
}
// @lc code=end

