class Solution {
    public int minOperations(int[] nums, int k) {
       int n=nums.length;
        Arrays.sort(nums);
        int cnt=0;
        
        for(int i=n-2;i>=0;i--){
            if(nums[i]!=nums[i+1])cnt++;
        }
        if(k<nums[0]){
            return cnt+1;
        }
        if(nums[n-1]==k&&cnt>0)return -1;
        if(nums[0]==k&&cnt==0){
            return 0;
        }
        if(nums[0]!=k){
            return -1;
        }
        if(nums[0]==k&&cnt>0){
            return cnt;
        }
        
        
        
       return -1; 
    }
}