class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0]));
         int n=score.length;
         String ans[]=new String[n];
         for(int i=0;i<n;i++){
            pq.add(new int[]{score[i],i});
         }
         int cnt=0;
           while(!pq.isEmpty()){
               int arr[]=pq.poll();
               int indx=arr[1];
               if(cnt==0){
                ans[indx]="Gold Medal";
               }
               else if(cnt==1){
                ans[indx]="Silver Medal";
               }
               else if(cnt==2){
                ans[indx]="Bronze Medal";
               }
               else{
                ans[indx]=Integer.toString(cnt+1);
               }
               cnt++;
           }

     
        return ans;
    }
}