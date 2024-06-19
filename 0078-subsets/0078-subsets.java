class Solution {
    public static void combination(int indx,int nums[],List<List<Integer>>ans, List<Integer>ds){
        if(indx>=nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[indx]);//take
        combination(indx+1,nums,ans,ds);
        ds.remove(ds.size()-1);
        combination(indx+1,nums,ans,ds);//not take
    }





    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>>ans=new ArrayList<>();
       List<Integer>ds=new ArrayList<>();
       combination(0,nums,ans,ds);
        return ans;
    }
}