class Solution {
    public int minOperations(int[] nums, int k) {
        int n=nums.length;
        PriorityQueue<Long>pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.add((long)nums[i]);
        }
        int cnt=0;
        while(pq.size()>=2){
            long a=pq.remove();
            long b=pq.remove();
            long mini=Math.min(a,b);
            if(mini>=k)break;
            long ans=(mini*2)+Math.max(a,b);
            pq.add(ans);
            cnt++;
        }
return cnt;
    }
}