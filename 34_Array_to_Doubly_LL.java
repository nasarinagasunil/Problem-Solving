class Solution {
    Node constructDLL(int arr[]) {
        // Code here
        Node head=new Node(arr[0]);
        Node temp=head;
        for(int i=1;i<arr.length;i++){
            Node temp1=new Node(arr[i]);
            temp.next=temp1;
            temp1.prev=temp;
            temp=temp.next;
        }
        return head;
    }
}
