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
class Solution {
    public int getDecimalValue(ListNode head) {

        ListNode temp = head;
        int num = 0;
        int size = 0;

        while (temp != null) {
            temp = temp.next;
            size++;
        }

        for (int i = 0; i < size; i++) {
            num = num + (int) Math.pow(2, size - 1 - i) * head.val;
            head = head.next;
        }
        return num;

    }
}