class Solution {
    public int findDuplicate(int[] nums) {
      for(int i=0;i<nums.length;i++){
        int indx=Math.abs(nums[i]);
        if(nums[indx]<0){
            return indx;
        }
        nums[indx]=-nums[indx];
      }  
      return -1;
    }
}