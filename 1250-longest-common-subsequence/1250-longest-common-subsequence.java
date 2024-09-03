class Solution {
    public int f(int indx1,int indx2,String text1,String text2,int dp[][]){
        if(indx1<0||indx2<0)return 0;
        if(dp[indx1][indx2]!=-1)return dp[indx1][indx2];
        if(text1.charAt(indx1)==text2.charAt(indx2)){
            return dp[indx1][indx2]=1+f(indx1-1,indx2-1, text1, text2,dp);
         } else return dp[indx1][indx2]=0+Math.max(f(indx1-1,indx2, text1, text2,dp),f(indx1,indx2-1, text1, text2,dp));
    }
    
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        int dp[][]=new int[m][n];
        for(int rows[]:dp){
            Arrays.fill(rows,-1);
        }
        return f(m-1,n-1,text1,text2,dp);
    }
}