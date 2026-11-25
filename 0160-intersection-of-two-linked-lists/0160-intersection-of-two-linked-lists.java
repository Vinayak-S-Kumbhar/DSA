/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currA = headA;
        ListNode currB = headB;

        int sizeA = 0;
        int sizeB = 0;
        while (currA != null) {
            sizeA++;
            currA = currA.next;
        }
        while (currB != null) {
            sizeB++;
            currB = currB.next;
        }

        currA = headA;
        currB = headB;

        if (sizeA > sizeB) {
            int n = sizeA - sizeB;

            while (n != 0) {
                currA = currA.next;
                n--;
            }
        } else {
            int n = sizeB - sizeA;

            while (n != 0) {
                currB = currB.next;
                n--;
            }
        }

        while (currA != null && currB != null) {
            if (currA == currB) {
                return currA;
            }

            currA = currA.next;
            currB = currB.next;
        }

        return null;
    }
}