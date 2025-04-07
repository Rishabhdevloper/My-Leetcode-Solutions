class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }
        int m=operations.length;
        for(int i=0;i<m;i++){
            int a=operations[i][0];
            int b=operations[i][1];
            if(map.containsKey(a)){
                int indx=map.get(a);
                nums[indx]=b;
                map.put(b,indx);
                map.remove(a);
            
        }
    }
    return nums;
    }
}