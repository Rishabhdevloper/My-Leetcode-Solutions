class Solution {
    public int minOperations(int[] nums, int k) {
       Arrays.sort(nums); 
       int fake=0;
       int op=0;
       int n=nums.length;
       for(int i=0;i<n-1;i++){
        if(nums[i]<k)fake++;
        if(nums[i]!=nums[i+1])op++;
       }
       if(fake>0||nums[0]<k)return -1;
       if(nums[0]>k)op++;
       return op;
    }
}