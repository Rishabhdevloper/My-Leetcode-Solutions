class Solution {
    public int[] resultsArray(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = i + 1;
        int n = nums.length;
        if(nums.length==1||k==1)return nums;
        
       boolean flag=true;
        while (j < n) {
             if ((j - i + 1) == k) {
                if (Math.abs(nums[j]-nums[j - 1])==1&&nums[j]>nums[j-1]&&flag==true) {
                    list.add(nums[j]);
                }
                 else {
                    list.add(-1);
                }
                i++;
                j = i + 1; 
                flag=true;// Reset j to maintain window size
            } 
            else {
                if(nums[j]-nums[j - 1]!=1){
                    flag=false;
                }
                j++;
            }
        }

        int[] arr = new int[list.size()];
        for (int m = 0; m < list.size(); m++) {
            arr[m] = list.get(m);
        }
        return arr;
    }
}
