class Solution {
    public int subsetXORSum(int[] nums) {
       int n=nums.length;
        int subsets=1<<n;
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<subsets;i++){
            ArrayList<Integer>list=new ArrayList<>();
             for(int j=0;j<n;j++){
                if ((i & (1 << j)) != 0){
                    list.add(nums[j]);
                }
             }
             ans.add(list);
        }
        int cnt=0;
        int xor=0;
        for(int i=0;i<ans.size();i++){
            List<Integer>li=ans.get(i);
        
            xor=0;
             for(int num:li){
                xor=xor^num;
             }
             cnt+=xor;
        }
        
        return cnt;
    }
}