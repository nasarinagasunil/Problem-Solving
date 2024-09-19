

/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;
    
    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static Node findTail(Node head){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        return temp;
    }
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        // code here
        Node left=head;
        Node right=findTail(head);
        ArrayList<ArrayList<Integer>> ds=new ArrayList<>();
        while(left.data<right.data){
            if(left.data+right.data==target){
                ArrayList<Integer> ls=new ArrayList<>();
                ls.add(left.data);
                ls.add(right.data);
                ds.add(ls);
                left=left.next;
                right=right.prev;
            }
            else if(left.data+right.data<target){
                left=left.next;
            }
            else{
                right=right.prev;
            }
        }
        return ds;
    }
}
        
