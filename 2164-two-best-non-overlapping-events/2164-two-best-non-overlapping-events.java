class Solution {
    public int maxTwoEvents(int[][] events) {
        int n=events.length;
        Arrays.sort(events,(a,b)-> a[0]-b[0]);
        int suff[]=new int[n];
        suff[n-1]=events[n-1][2];
        for(int i=n-2;i>=0;i--){
            suff[i]=Math.max(suff[i+1],events[i][2]);
        }
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
           int low=i+1;
           int val=events[i][2];
           int high=n-1;
           int res=-1;
           while(low<=high){
            int mid=(low+high)/2;
            if(events[i][1]<events[mid][0]){
                res=mid;
                high=mid-1;

            }
            else{
                low=mid+1;
            }
           }
           if(res!=-1){
                ans=Math.max(ans,suff[res]+val);
           }
           else{
            ans=Math.max(ans,val);
           }

        }
        return ans;
       
    }
}