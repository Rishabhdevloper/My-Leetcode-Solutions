class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int cnt=0;
        int ans=0;
        for(int i=0;i<n;i++){
            int a=nums[i];
            cnt=0;
            while(a>0){
               cnt++;
               a=a/10; 
            }
            if(cnt%2==0){
             ans++;
            }
        }
        return ans;
    }
}