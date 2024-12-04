class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int prod=1;
        int prodzeo=1;
        int cntzero=0;
        for(int i=0;i<n;i++){
           prod=prod*nums[i];
           if(nums[i]==0)cntzero++;
        }
        
        for(int i=0;i<n;i++){
           if(nums[i]!=0){
            prodzeo=prodzeo*nums[i];
           }
        }
        System.out.print(prodzeo);
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
            ans[i]=prod/nums[i];
            }
            else{
                if(cntzero==1){
                    ans[i]=prodzeo;
                }
                else{
                    ans[i]=0;
                }
            }

        }
        return ans;
    }
}