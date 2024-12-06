class Solution {
    public void dfs(int node,int visited[],ArrayList<ArrayList<Integer>> adjList){
        visited[node]=1;
        int size=adjList.size();
        for(Integer it:adjList.get(node)){
            if(visited[it]==0){
                dfs(it,visited,adjList);
            }
            
        }
    }
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
        int size=isConnected.length;
        for(int i=0;i<size;i++){
            adjList.add(new ArrayList<>());
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adjList.get(i).add(j);
                    adjList.get(j).add(i);
                }
            }
        }
        int visited[]=new int[size];
        int count=0;
        for(int i=0;i<size;i++){
            if(visited[i]==0){
                count++;
                dfs(i,visited,adjList);
            }
        }
        return count;
    }
}
