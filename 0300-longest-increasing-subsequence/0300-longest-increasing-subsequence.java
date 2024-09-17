class Solution {
          public static int f(int indx,int prev_indx,int nums[],int dp[][]){
            if(indx==nums.length)return 0;
            if(dp[indx][prev_indx+1]!=-1)return dp[indx][prev_indx+1];
           int len=0+f(indx+1,prev_indx,nums,dp);  
            if(prev_indx==-1||nums[indx]>nums[prev_indx]){
            len=Math.max(len,1+f(indx+1,indx,nums,dp));
            }
            return dp[indx][prev_indx+1]=len;
          }

     
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int count=1;
        int prev_indx=-1;
        int dp[][]=new int[n][n+1];
        for(int rows[]:dp){
            Arrays.fill(rows,-1);
        }
        return f(0,prev_indx,nums,dp);
    }
}