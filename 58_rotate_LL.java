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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;
        int length=1;
        ListNode tail=head;
        while(tail.next!=null){

            tail=tail.next;
            length++;
        }
        k=k%length;
        if(k==0){
            return head;
        }
        tail.next=head;
        int count=1;
        ListNode temp=head;
        while(count<(length-k)){
            temp=temp.next;
            count++;
        }
        head=temp.next;
        temp.next=null;
        return head;
        
    }
}
