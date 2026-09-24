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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next!=null && left==right){
            return head;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prevleft=dummy;
        for(int i=1;i<left;i++){
            prevleft=prevleft.next;
        }
        ListNode current=prevleft.next;
        ListNode prev=null;
        for(int i=0;i<=right-left;i++){
            ListNode next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        ListNode leftnode=prevleft.next;
        prevleft.next=prev;
        leftnode.next=current;
        return dummy.next;

    }
}