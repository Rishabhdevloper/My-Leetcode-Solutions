class Solution {
    public int[] buildArray(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(i,nums[i]);
        }
        for(int i=0;i<n;i++){
            nums[i]=map.get(nums[i]);
        }

       return nums; 
    }
}