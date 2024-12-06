class Solution {
    public void dfs(int image[][],int sr,int sc,int initColor,int newColor,int visited[][]){
        int n=image.length;
        int m=image[0].length;
        visited[sr][sc]=1;
        image[sr][sc]=newColor;
        int drow[]={-1,0,1,0};
        int dcol[]={0,-1,0,1};
        for(int i=0;i<4;i++){
            int nrow=sr+drow[i];
            int ncol=sc+dcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && image[nrow][ncol]==initColor && visited[nrow][ncol]==0){
                dfs(image,nrow,ncol,initColor,newColor,visited);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;
        int temp[][]=new int[n][m];
        int initialColor=image[sr][sc];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                temp[i][j]=image[i][j];
            }
        }
        int visited[][]=new int[n][m];
        dfs(temp,sr,sc,initialColor,color,visited);
        return temp;
    }
}
