class Solution {
    public int f(int i,int j,int arr[][],int dp[][]){
        int n=arr.length;
        if(i==n-1)return arr[i][j];
        if(dp[i][j]!=-1)return dp[i][j];
        int up=arr[i][j]+f(i+1,j,arr,dp);
        int down=arr[i][j]+f(i+1,j+1,arr,dp);
        return dp[i][j]=Math.min(up,down);

    }
    




    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int arr[][]=new int[n][n];
        int dp[][]=new int[n][n];
        for(int rows[]:arr){
            Arrays.fill(rows,-1);
        }
        for(int rows[]:dp){
            Arrays.fill(rows,-1);
        }
        for(int i=0;i<n;i++){
            int j=0;
            for(int it:triangle.get(i)){ 
                arr[i][j++]=it;
            }
        }
       return f(0,0,arr,dp);
       
    }
}