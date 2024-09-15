// User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        // add your code here
        if(head==null || head.next==null){
            return head;
        }
        Node temp=head;
        Node zerosHead=new Node(-1);
        Node zero=zerosHead;
        Node onesHead=new Node(-1);
        Node one=onesHead;
        Node twosHead=new Node(-1);
        Node two=twosHead;
        while(temp!=null){
            if(temp.data==0){
                zero.next=temp;
                zero=temp;
            }
            else if(temp.data==1){
                one.next=temp;
                one=temp;
            }
            else{
                two.next=temp;
                two=temp;
            }
            temp=temp.next;
        }
        zero.next=(onesHead.next!=null) ? onesHead.next : twosHead.next;
        one.next=twosHead.next;
        two.next=null;
        return zerosHead.next;
        
    }
}

