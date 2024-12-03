

class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public void dfs(int node,boolean visited[],ArrayList<Integer> traversal,ArrayList<ArrayList<Integer>> adj){
        visited[node]=true;
        traversal.add(node);
        for(Integer it:adj.get(node)){
            if(!visited[it]){
                dfs(it,visited,traversal,adj);
            }
        }
        
    }
    public ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int size=adj.size();
        boolean visited[]=new boolean[size];
        visited[0]=true;
        ArrayList<Integer> traversal=new ArrayList<>();
        dfs(0,visited,traversal,adj);
        return traversal;
        
    }
}
