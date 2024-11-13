class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxii=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }else{
                count=0;
            }
            maxii=Math.max(maxii,count);
        }
        return maxii;
    }
}