class Solution {
    public long maxKelements(int[] nums, int k) {
        int n=nums.length;
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
       for(int i=0;i<n;i++){
           pq.add(nums[i]);
       }
        long score=0;
        while(k>0){
            double ans=pq.peek();
          score+=pq.peek();
          pq.remove();
          pq.add((int)Math.ceil((double)ans/3.0));
          
          k--;
        }
        return score;
        
    }
}