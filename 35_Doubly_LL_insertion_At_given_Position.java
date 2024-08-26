/* Structure of Doubly Linked List
class Node
{
	int data;
	Node next;
	Node prev;
	Node(int data)
	{
	    this.data = data;
	    next = prev = null;
	}
}*/

class GfG
{
    //Function to insert a new node at given position in doubly linked list.
    void addNode(Node head_ref, int pos, int data)
	{
		// Your code here
		Node current=head_ref;
		Node temp=new Node(data);
		int count=0;
		while(count<pos){
		    current=current.next;
		    count++;
		}
		
		temp.next=current.next;
		temp.prev=current;
		current.next=temp;
		
		
	}
}
