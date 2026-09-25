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
    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || head.next == null || k == 1) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevgroup = dummy;

        while (true) {

            // Find kth node
            ListNode kth = prevgroup;

            for (int i = 0; i < k && kth != null; i++) {
                kth = kth.next;
            }

            // Less than k nodes remaining
            if (kth == null) {
                break;
            }

            ListNode groupnext = kth.next;

            // Reverse the group
            ListNode current = prevgroup.next;
            ListNode prev = groupnext;

            while (current != groupnext) {

                ListNode next = current.next;

                current.next = prev;

                prev = current;
                current = next;
            }

            // Connect reversed group
            ListNode temp = prevgroup.next;

            prevgroup.next = kth;

            prevgroup = temp;
        }

        return dummy.next;
    }
}