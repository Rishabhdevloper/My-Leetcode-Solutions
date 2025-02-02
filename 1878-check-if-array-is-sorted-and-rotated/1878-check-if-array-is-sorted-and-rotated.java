class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int pivot=-1;
        for(int i=1;i<n;i++){
           if(nums[i-1]>nums[i]){
            pivot=i-1;
            break;
           }
        }
    if(pivot!=-1){
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        for(int i=0;i<=pivot;i++){
             list1.add(nums[i]);
        }
        for(int i=pivot+1;i<n;i++){
             list2.add(nums[i]);
        }
        int arr[]=new int[n];
        int j=0;
        for(int i=0;i<list2.size();i++){
             arr[j]=list2.get(i);
             j++;
        }
        for(int i=0;i<list1.size();i++){
             arr[j]=list1.get(i);
             j++;
        }
         for(int i=1;i<n;i++){
           if(arr[i-1]>arr[i]){
            return false;
           }
        }

    }
    return true;
    }
}