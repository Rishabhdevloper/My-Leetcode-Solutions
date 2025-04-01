class Solution {
    public static long f(int[][] questions,int i,long dp[]){
        int n=questions.length;
        if(i>=n)return 0;
        if(dp[i]!=-1)return dp[i];
        long take=questions[i][0]+f(questions,i+questions[i][1]+1,dp);
        long  nottake=f(questions,i+1,dp);
        return dp[i]=Math.max(take,nottake);

        
    }
    public long mostPoints(int[][] questions) {
        int n=questions.length;
        long dp[]=new long[n+1];
        Arrays.fill(dp,-1);

        return f(questions,0,dp);
    }
}