class Solution {
    public int maximumBeauty(int[] nums, int k) {
        int n=nums.length;
        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++){
             arr[i][0]=nums[i]-k;
             arr[i][1]=nums[i]+k;

        }
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        int maxBeauty = 0;
        Queue<Integer> queue = new LinkedList<>();
        for(int val[]:arr){
            while(!queue.isEmpty()&&queue.peek()<val[0]){
                queue.poll();
            }
            queue.add(val[1]);
            maxBeauty=Math.max(maxBeauty,queue.size());
        }
        return maxBeauty;
      
    }
}