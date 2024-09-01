/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/

// sortedInsert method should return the head of the modified linked list.
class Solution {
    Node sortedInsert(Node head, int x) {
        // Add your code here.
        Node temp=new Node(x);
        if(head==null){
            return temp;
        }
        if(x<head.data){
            temp.next=head;
            return temp;
        }
        Node current=head;
        while(current.next!=null && current.next.data<=x){
            current=current.next;
        }
        temp.next=current.next;
        current.next=temp;
        return head;
    }
}
