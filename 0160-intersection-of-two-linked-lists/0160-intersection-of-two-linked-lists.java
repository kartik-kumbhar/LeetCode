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

        ListNode A = headA;
        ListNode B = headB;

        int lenA = 0;
        int lenB = 0;
        
        while (A != null) {
            lenA++;
            A = A.next;
        }

        while (B != null) {
            lenB++;
            B = B.next;
        }

        while (lenA < lenB) {
            lenB--;
            headB = headB.next;
        }

        while (lenA > lenB) {
            lenA--;
            headA = headA.next;
        }

        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}