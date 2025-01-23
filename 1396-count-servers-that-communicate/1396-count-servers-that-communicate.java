class Solution {
    public int countServers(int[][] grid) {
        int ans=0;
        int n=grid.length;
        int m=grid[0].length;
        int rvis[]=new int[n];
        int cvis[]=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if(grid[i][j]==1){
                rvis[i]++;
                cvis[j]++;
               }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if(grid[i][j]==1){
                if(rvis[i]>1||cvis[j]>1){
                    ans++;
                }
               }
            }
        }
       return ans;
    }
}