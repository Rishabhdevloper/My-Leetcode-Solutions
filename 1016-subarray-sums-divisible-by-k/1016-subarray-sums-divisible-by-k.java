class Solution {
    public int subarraysDivByK(int[] nums, int k) {
      HashMap<Integer,Integer>map=new HashMap<>();
      map.put(0,1);
      int cnt=0;
      int n=nums.length;
      int sm=0;
      for(int i=0;i<n;i++){
         sm+=nums[i];
         int mod=sm%k;
         if(mod<0){
            mod+=k;
         }
         if(map.containsKey(mod)){
            cnt+=map.get(mod);
            map.put(mod,map.get(mod)+1);
         }
         else{
            map.put(mod,1);
         }


      }
      

    return cnt;
    }
}