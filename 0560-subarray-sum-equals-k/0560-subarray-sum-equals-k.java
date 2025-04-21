class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int n=nums.length;
        int pref[]=new int[n];
        pref[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pref[i]=pref[i-1]+nums[i];
        }
        int cnt=0;
        for(int i=0;i<n;i++){
                if(map.containsKey(pref[i]-k)){
                   cnt+=map.get(pref[i]-k);
                }
                
            
            map.put(pref[i],map.getOrDefault(pref[i],0)+1);
        }

        return cnt;
    }
}