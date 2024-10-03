class Solution {
    public static int f(int nums[],int k){
        int n=nums.length;
         int left=0;
        int right=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        int count=0;
        while(right<n){
            int val=nums[right];
            map.put(val, map.getOrDefault(val, 0) + 1);
            while(map.size()>k){
                   int front=nums[left];
                   if(map.get(front)==1){
                      map.remove(front);
                   }
                   else{
                    map.put(front,map.get(front)-1);
                   }
                   left++;
            }
            count+=right-left+1;
            right++;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
       return f(nums,k)-f(nums,k-1);


        
    }
}