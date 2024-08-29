

/*

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/

// Function should return the length of the loop in LL.

class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // Add your code here.
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                fast=fast.next;
                int count=1;
                while(fast!=slow){
                    fast=fast.next;
                    count++;
                }
                return count;
            }
        }
        return 0;
        
        /**
        Node temp=head;
        int timer=1;
        HashMap<Node,Integer> map=new HashMap<>(); 
        while(temp!=null){
            if(map.containsKey(temp)){
                return timer-map.get(temp);
            }
            map.put(temp,timer);
            temp=temp.next;
            timer++;
        }
        return 0;
        **/
    }
}
