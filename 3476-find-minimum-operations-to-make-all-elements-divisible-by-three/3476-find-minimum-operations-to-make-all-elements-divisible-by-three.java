class Solution {
    public int minimumOperations(int[] nums) {
        int l=nums.length;
        int count=0;
        for(int i=0;i<l;i++){
            if(nums[i]%3==0){
                continue;
            }
            else{
                count++;
            }
        }
        return count;
        
    }
}