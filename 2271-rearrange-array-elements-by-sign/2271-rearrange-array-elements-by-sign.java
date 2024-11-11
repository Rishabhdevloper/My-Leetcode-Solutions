class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length/2;
     ArrayList<Integer>list1=new ArrayList<>(); 
     ArrayList<Integer>list2=new ArrayList<>(); 
      for(int i=0;i<2*n;i++){
        if(nums[i]>=0){
              list1.add(nums[i]);
        }
        else{
            list2.add(nums[i]);
        }
      }
      int l=0;
      int r=0;
      for(int i=0;i<2*n;i++){
        if(i%2==0){
            nums[i]=list1.get(l);
            l++;
        }
        else{
            nums[i]=list2.get(r);
            r++;
        }
        
      } 
      return nums;
      
    }
}