class Solution {
    public int longestNiceSubarray(int[] nums) {
      
        int n=nums.length;
        int maxi=1;
        
         for(int i=0;i<n;i++){
            int j=i;
            int ans=0;
             while(j<n){
                  if((ans&nums[j])==0){
                    maxi=Math.max(maxi,j-i+1);
                    ans=ans|nums[j];
                    j++;
                  }
                  else{
                    break;
                  }
             }
         }
        return maxi;
    }
}