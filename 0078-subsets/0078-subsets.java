class Solution {
    public static void f(int indx,int n, List<List<Integer>>list, List<Integer>l,int nums[]){
        if(indx>=n){
           list.add(new ArrayList<>(l));
          
           return;
        }
        l.add(nums[indx]);
        f(indx+1,n,list,l,nums);//take
        l.remove(l.size()-1);
        f(indx+1,n,list,l,nums);//not take


    }

    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<List<Integer>>list=new ArrayList<>();
        List<Integer>l=new ArrayList<>();
        int indx=0;
        f(0,n,list,l,nums);
        return list;
    }
}