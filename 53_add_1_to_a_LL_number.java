/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node reverse(Node head){
        Node prev=null;
        Node current=head;
        Node next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
    public Node addOne(Node head) {
        // code here.
        head=reverse(head);
        Node temp=head;
        int carry=1;
        while(temp!=null){
            int val=temp.data+carry;
            temp.data=val%10;
            carry=val/10;
            temp=temp.next;
        }
        head=reverse(head);
        if(carry==1){
            Node node=new Node(carry);
            node.next=head;
            return node;
        }
        return head;
    }
}
