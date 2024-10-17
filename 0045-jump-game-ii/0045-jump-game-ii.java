class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int l=0;
        int r=0;
        int far=0;
        int jumps=0;
       while(r<n-1){
        for(int i=l;i<=r;i++){
            far=Math.max(far,i+nums[i]);
        }
        l=r+1;
        r=far;
        jumps++;

       }
       return jumps;
    }
}