class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n=nums.length;
        long maxi=Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,nums[i]);
        }
        int left=0;
        int cnt=0;
        long ans=0;
        for(int right=0;right<n;right++){
            if(nums[right]==maxi)cnt++;
            if(cnt>=k){
                while(left<=right&&cnt>=k){
                    ans+=(n-right);
                    if(nums[left]==maxi)cnt--;
                    left++;
                }
            }
        }
        return ans;
    }
}