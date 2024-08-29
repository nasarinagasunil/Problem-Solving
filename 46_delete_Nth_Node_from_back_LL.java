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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }
        ListNode fast=head;
        ListNode slow=head;
        ListNode prev=null;
        for(int i=0;i< n-1;i++){
            fast=fast.next;
        }
        while(fast!=null && fast.next != null){
            prev = slow;
            slow=slow.next;
            fast=fast.next;
        }
        if (prev == null) head = slow.next;
        else prev.next = slow.next;
        return head;
    }
}
