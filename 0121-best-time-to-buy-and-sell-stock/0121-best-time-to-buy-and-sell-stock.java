class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxii=prices[n-1];
        int ans=0;
        for(int i=n-2;i>=0;i--){
             maxii=Math.max(maxii,prices[i]);
             ans=Math.max(ans,maxii-prices[i]);
        }
        return ans;
    }
}