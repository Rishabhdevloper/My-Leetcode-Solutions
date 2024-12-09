class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
      int n=nums.length;
      
      int pref[]=new int[n];
      int m=queries.length;
      boolean ans[]=new boolean[m];
      pref[0]=0;
      int cnt=0;
      for(int i=1;i<n;i++){
        cnt=0;
        if((nums[i]%2)==(nums[i-1]%2)){
            cnt++;
        }
        pref[i]=pref[i-1]+cnt;
      }
      
      for(int i=0;i<m;i++){
        int x=queries[i][0];
        int y=queries[i][1];
        if(pref[y]-pref[x]>0){
          ans[i]=false;
        }
        else{
            ans[i]=true;
        }

      }




      return ans;
    }
}