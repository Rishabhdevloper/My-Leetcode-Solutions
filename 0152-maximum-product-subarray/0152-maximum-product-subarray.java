class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int prod=1;
        int maxii=Integer.MIN_VALUE;
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<nums.length;i++){
            prod=nums[i];
            maxii=Math.max(prod,maxii);
            for(int j=i+1;j<nums.length;j++){
                prod=prod*nums[j];
                maxii=Math.max(prod,maxii);
            }
            prod=1;
        }
        return maxii;
    }
}