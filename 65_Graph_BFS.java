

// User function Template for Java
class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> traversal=new ArrayList<>();
        boolean visitedArray[]=new boolean[V];
        Queue<Integer> queue=new LinkedList<>();
        
        queue.add(0);
        visitedArray[0]=true;
        while(!queue.isEmpty()){
            int currentVertex=queue.poll();
            traversal.add(currentVertex);
            for(int neighbour:adj.get(currentVertex)){
                if(!visitedArray[neighbour]){
                    visitedArray[neighbour]=true;
                    queue.add(neighbour);
                }
            }
        }
        return traversal;
    }
}
