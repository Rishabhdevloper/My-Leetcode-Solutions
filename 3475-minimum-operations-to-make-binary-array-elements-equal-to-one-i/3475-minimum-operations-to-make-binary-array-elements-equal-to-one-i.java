class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int cnt=0;
        for(int i=0;i<n-2;i++){
            if(nums[i]==0){
                for(int j=i;j<i+3;j++){
                    if(nums[j]==0){
                        nums[j]=1;
                    }
                    else{
                        nums[j]=0;
                    }
                }
                cnt++;
            }
        }
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                flag=true;
                break;
            }
        }
        if(flag){
            return -1;
        }
        return cnt;
    }
}