class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        ArrayList<Integer>list3=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                list1.add(nums[i]);
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]==pivot){
                list2.add(nums[i]);
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>pivot){
                list3.add(nums[i]);
            }
        }
        int it=0;
        for(int i=0;i<list1.size();i++){
            nums[it]=list1.get(i);
            it++;
        }
        for(int i=0;i<list2.size();i++){
            nums[it]=list2.get(i);
            it++;
        }
        for(int i=0;i<list3.size();i++){
            nums[it]=list3.get(i);
            it++;
        }
       return nums;
    }
}