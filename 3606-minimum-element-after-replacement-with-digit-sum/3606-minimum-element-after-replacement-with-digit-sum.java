class Solution {
    public int minElement(int[] nums) {
        int n=nums.length;
        int digits=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=0;
            digits=nums[i];
            while(digits>0){
                sum=sum+digits%10;
                digits=digits/10;
            }
            nums[i]=sum;

        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            ans=Math.min(ans,nums[i]);
        }
        return ans;
    }
}