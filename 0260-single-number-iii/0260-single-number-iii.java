class Solution {
    public int[] singleNumber(int[] nums) {
        int n=nums.length;
        ArrayList<Integer>list=new ArrayList<>();
        Arrays.sort(nums);
        if(n>1){
            if(nums[0]!=nums[1]){
                list.add(nums[0]);
            }
        }
        if(n>1){
            if(nums[n-1]!=nums[n-2]){
                list.add(nums[n-1]);
            }
        }
     for(int i=1;i<n-1;i++){
        if(nums[i]!=nums[i-1]&&nums[i]!=nums[i+1]){
           list.add(nums[i]);
        }
     }
     int l=list.size();
     int arr[]=new int[l];
     for(int i=0;i<l;i++){
        arr[i]=list.get(i);
     }
     return arr;

    }
}