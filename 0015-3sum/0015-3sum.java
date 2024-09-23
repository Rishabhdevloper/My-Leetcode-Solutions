class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        HashSet<List<Integer>>set=new HashSet<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            int j=i+1;
            int k=nums.length-1;
           while(j<k){
            int sum=nums[i]+nums[j]+nums[k];
            if(sum==0){
                set.add(Arrays.asList(nums[i],nums[j],nums[k]));
                j++;
                k--;
            }
            else if(sum>0){
                k--;
            }
            else{
                j++;
            }
           }
        }
        list.addAll(set);
        return list;
    }
}