class Solution {
    public int[] applyOperations(int[] nums) {
        int j=1;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
           if(nums[i]==nums[j]){
            nums[i]=nums[i]*2;
            nums[j]=0;
           }
           j++;
        }
        int x=0;
        int y=1;
        while(y<n){
            if(nums[x]==0&&nums[y]!=0){
                int temp=nums[x];
                nums[x]=nums[y];
                nums[y]=temp;
                x++;
                y++;
            }
            else if(nums[x]!=0){
                x++;
                y++;
            }
            else if(nums[y]==0){
                y++;
            }
            
        }
       
        return nums;
    }
}