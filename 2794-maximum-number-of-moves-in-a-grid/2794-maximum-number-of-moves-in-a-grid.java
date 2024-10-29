class Solution {
    public static int dfs(int row,int col,int grid[][],int dp[][]){
        int n=grid.length;
        int m=grid[0].length;
        //row={-1,0,-1}
        int dir[]={-1,0,1};
        int moves=0;
        if(dp[row][col]!=-1){
            return dp[row][col];
        }
        for(int way:dir){
            int nrow=row+way;
            int ncol=col+1;
            if(nrow>=0&&nrow<n&&ncol>=0&&ncol<m&&grid[nrow][ncol]>grid[row][col]){
                moves=Math.max(moves,1+dfs(nrow,ncol,grid,dp));
            }

        }
        return dp[row][col]=moves;
    }



    public int maxMoves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int maxi=0;
        int dp[][]=new int[n][m];
        for(int arr[]:dp){
            Arrays.fill(arr,-1);
        }
       for(int row=0;row<n;row++){
        maxi=Math.max(maxi,dfs(row,0,grid,dp));
       }
       return maxi;
    }
}