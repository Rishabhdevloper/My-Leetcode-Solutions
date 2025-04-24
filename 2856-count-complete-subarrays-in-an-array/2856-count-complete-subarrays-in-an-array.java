class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int ans=set.size(); 
        int j=0;
        int cnt=0;
        int an=0;
        for(int i=0;i<n;i++){
              j=i;
            cnt=0;
            set.clear();
             while(j<n){
                set.add(nums[j]);
                if(set.size()==ans)cnt++;
                if(set.size()>ans)break;
                j++;

             }
             
             an+=cnt;
        }
     return an;
       
    }
}