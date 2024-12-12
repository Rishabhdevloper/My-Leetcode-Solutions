class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        int n=gifts.length;
        for(int i=0;i<n;i++){
            pq.add(gifts[i]);
        }
        while(k>0){
            int a=pq.peek(); 
            int flooredValue = (int) Math.floor(Math.sqrt(a));
            pq.remove();
            pq.add(flooredValue);
            k--;
        }
        long sum=0;
        while(!pq.isEmpty()){
            sum+=pq.poll();
        }
        return (long)sum;
    }
}