class Solution {
    public int countSubarrays(int[] nums) {
        int cnt=0;
        int i=0;
        int j=2;
        int n=nums.length; 
        while(j<n){
            double x=(nums[i]+nums[j]);
            double y=(double)nums[j-1]/2.0;
            System.out.print(y);

            if(x==y){
                cnt++;
                i++;
                j++;
            }
            else{
                i++;
                j++;
            }
        }
        return cnt;
    }
}