class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n=nums.length;
        int answer[]=new int[n-k+1];
        Arrays.fill(answer,-1);
        int count=1;
       for(int i=1;i<k;i++){
        if(nums[i]>nums[i-1]&&nums[i]-nums[i-1]==1){
            count++;
        }
        else {
            count=1;
        }
       }
       if(count==k){
        answer[0]=nums[k-1];
       }
       int i=1;
       int j=k;
       while(j<n){
       if(nums[j-1]+1==nums[j]){
        count++;
       }
       else{
        count=1;
       }
       if(count>=k){
        answer[i]=nums[j];
       }
       i++;
       j++;
       
      
    }
     return answer;
}
}
