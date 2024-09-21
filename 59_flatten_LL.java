// User function Template for Java



class Solution {

    // Function to flatten a linked list

    Node merge(Node temp1,Node temp2){

        Node dummyNode=new Node(-1);

        Node res=dummyNode;

        while(temp1!=null && temp2!=null){

            if(temp1.data<temp2.data){

                res.bottom=temp1;

                res=res.bottom;

                temp1=temp1.bottom;

            }

            else{

                res.bottom=temp2;

                res=res.bottom;

                temp2=temp2.bottom;

            }

        }

        if(temp1!=null){

            res.bottom=temp1;

        }

        else{

            res.bottom=temp2;

        }

        return dummyNode.bottom;

    }

    Node flatten(Node root) {

        // code here

        if(root==null || root.next==null){

            return root;

        }

        Node mergedHead=flatten(root.next);

        return merge(root,mergedHead);

        

        

        /**Node temp=root;

        ArrayList<Integer> ds=new ArrayList<>();

        while(temp!=null){

            Node temp2=temp;

            while(temp2!=null){

                ds.add(temp2.data);

                temp2=temp2.bottom;

            }

            temp=temp.next;

        }

        Collections.sort(ds);

        Node current=new Node(-1);

        Node newHead=current;

        for(int i=0;i<ds.size();i++){

            Node node=new Node(ds.get(i));

            current.bottom=node;

            current=current.bottom;

        }

        return newHead.bottom;

        **/

        

    }

}


