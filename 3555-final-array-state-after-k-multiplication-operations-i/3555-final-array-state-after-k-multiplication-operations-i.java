class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n=nums.length;
        PriorityQueue<int[]> pq=new  PriorityQueue<>((a,b)->a[0]==b[0]?a[1]-b[1]:a[0]-b[0]);
        for(int i=0;i<n;i++){
           pq.add(new int[]{nums[i],i}); 
        }
        while(k>0){
            int arr[]=pq.poll();
            int val=arr[0];
            int indx=arr[1];
            nums[indx]=nums[indx]*multiplier;
            pq.add(new int[]{nums[indx],indx});
            k--;

        }

        return nums;
    }
}