class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int ans=set.size(); 
        int i=0;
        int j=0;
        int cnt=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        while(j<n&&i<=j){
              map.put(nums[j],map.getOrDefault(nums[j],0)+1);
              if(map.size()==ans){
                cnt+=(n-j);
                while(i<=j&&map.size()==ans){
                     int front=nums[i];
                     if(map.get(front)==1){
                        map.remove(front);
                     }
                     else{
                        map.put(front,map.getOrDefault(front,0)-1);
                     }
                     i++;
                     if(map.size()==ans)cnt+=(n-j);
                     
                     

                }
              }
                j++;
              
        }
        
       return cnt;
    }
}