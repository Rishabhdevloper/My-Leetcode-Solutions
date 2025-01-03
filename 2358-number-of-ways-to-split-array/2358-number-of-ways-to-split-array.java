class Solution {
    public int waysToSplitArray(int[] nums) {
        int n=nums.length;
        long pref[]=new long[n];
        pref[0]=nums[0];
        long total=nums[0];
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+(long)nums[i];
            total+=(long)nums[i];
        }
        int ans=0;
        for(int i=0;i<n-1;i++){
            if(pref[i]>=total-pref[i])ans++;
        }

return ans;
    }
}