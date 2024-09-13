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
    public ListNode Merge(ListNode list1,ListNode list2){
        ListNode dummyNode=new ListNode(-1);
        ListNode temp=dummyNode;
        while(list1!=null && list2!=null){
            if(list1.val < list2.val){
                temp.next=list1;
                temp=list1;
                list1=list1.next;
            }
            else{
                temp.next=list2;
                temp=list2;
                list2=list2.next;
            }
        }
        if(list1!=null){
            temp.next=list1;
        }
        else{
            temp.next=list2;
        }
        return dummyNode.next;
    }
    public static ListNode findMiddleNode(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode middle=findMiddleNode(head);
        ListNode leftHead=head;
        ListNode rightHead=middle.next;
        middle.next=null;
        leftHead=sortList(leftHead);
        rightHead=sortList(rightHead);
        return Merge(leftHead,rightHead);

        /**if(head==null || head.next==null){
            return head;
        }
        ListNode temp=head;
        ArrayList<Integer> arr=new ArrayList<>();
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        for(int i=0;i<arr.size()-1;i++){
            for(int j=0;j<arr.size()-1-i;j++){
                if(arr.get(j)>arr.get(j+1)){
                    int dummy=arr.get(j);
                    arr.set(j,arr.get(j+1));
                    arr.set(j+1,dummy);
                }
            }
        }
        temp=head;
        for(int i=0;i<arr.size();i++){
            temp.val=arr.get(i);
            temp=temp.next;
        }
        return head;
        **/
    }
    
}
