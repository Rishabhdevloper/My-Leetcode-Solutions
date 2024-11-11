class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int posvalue=0;
        int negvalue=1;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                ans[negvalue]=nums[i];
                negvalue+=2;
            }else{
                ans[posvalue]=nums[i];
                posvalue+=2;
            }
        }
        return ans;
    }
}