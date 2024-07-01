class Solution {


    public static void helper(List<List<Integer>>ans,List<Integer>ds,boolean help[],int[] nums){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
        }
        for(int i=0;i<nums.length;i++){
            if(!help[i]){
                help[i]=true;
                ds.add(nums[i]);
                helper(ans,ds,help,nums);
                ds.remove(ds.size()-1);
                help[i]=false;
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>ds=new ArrayList<>();
        boolean help[]=new boolean[nums.length];
        helper(ans,ds,help,nums);
        return ans;
    }
}