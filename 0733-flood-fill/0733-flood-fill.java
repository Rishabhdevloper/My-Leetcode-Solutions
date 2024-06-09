class Solution {
          public static void dfs(int row,int column,int image[][],int ans[][],int color,int delrow[],int delcol[],int inicolor){
            ans[row][column]=color;
            int n=image.length;
            int m=image[0].length;
            for(int i=0;i<4;i++){
            int nrow=row+delrow[i];
            int ncol=column+delcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m &&ans[nrow][ncol]==inicolor &&ans[nrow][ncol]!=color)
                dfs(nrow,ncol,image,ans,color,delrow,delcol,inicolor);
            }
          }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int ans[][]=image;
        int inicolor=ans[sr][sc];
        int delrow[]={-1,0,+1,0};
        int delcol[]={0,+1,0,-1};
        dfs(sr,sc,image,ans,color,delrow,delcol,inicolor);
        return ans;
    }
}