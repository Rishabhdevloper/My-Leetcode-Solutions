class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int n=nums.length;
        int mini=-1;
        int  maxi=-1;
        int badi=-1;
        long ans=0;
        for(int i=0;i<n;i++){
           if(nums[i]==minK)mini=i;
           if(nums[i]==maxK)maxi=i;
           if(nums[i]<minK||nums[i]>maxK)badi=i;
           if(mini!=-1&&maxi!=-1){
             ans+=Math.max(0,Math.min(mini,maxi)-badi);
           }

        }
        return ans;
        
    }
}
// nums = [1,3,5,2,7,5], minK = 1, maxK = 5