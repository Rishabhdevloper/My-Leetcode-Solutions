class Solution {
    public int numIdenticalPairs(int[] nums) {
        Arrays.sort(nums);
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    cnt++;
                }
                else{
                    break;
                }
            }
        }
        return cnt;
    }
}