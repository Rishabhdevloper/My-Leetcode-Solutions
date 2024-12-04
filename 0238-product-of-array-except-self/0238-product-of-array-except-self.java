class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int answer[]=new int[n];
        int prefsum[]=new int[n];
        int suffsum[]=new int[n];
        prefsum[0]=nums[0];
        suffsum[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            prefsum[i]=prefsum[i-1]*nums[i];
        }
        for(int i=n-2;i>=0;i--){
            suffsum[i]=suffsum[i+1]*nums[i];
        }
        answer[0]=suffsum[1];
        answer[n-1]=prefsum[n-2];
        for(int i=1;i<n-1;i++){
            answer[i]=prefsum[i-1]*suffsum[i+1];
        }

        return answer;
        
    }
}