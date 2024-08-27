/*

Definition for doubly Link List Node
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node deleteNode(Node head, int x) {
        Node temp=head;
        for(int i=1;i<x;i++){
            temp=temp.next;
        }
        if(temp.prev==null) return head=temp.next;
        else temp.prev.next=temp.next;
        if(temp.next!=null){
            temp.next.prev=temp.prev;
        }
        temp.next=null;
        temp.prev=null;
        return head;
        
        
    }
}
