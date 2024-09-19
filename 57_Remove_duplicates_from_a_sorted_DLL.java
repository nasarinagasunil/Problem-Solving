
                                                                                                                                                                                                                                                                                  
//User function Template for Java

class Solution{
    Node removeDuplicates(Node head){
        // Code Here.
        Node temp=head;
        while(temp!=null && temp.next!=null){
            Node nextNode=temp.next;
            while(nextNode!=null && nextNode.data==temp.data){
                nextNode=nextNode.next;
            }
            temp.next=nextNode;
            if(nextNode!=null){
                nextNode.prev=temp;
            }
            temp=nextNode;
        }
        return head;
        
    }
}
