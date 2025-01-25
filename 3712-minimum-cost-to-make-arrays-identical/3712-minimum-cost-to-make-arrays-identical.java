class Solution {
    public long minCost(int[] arr, int[] brr, long k) {
        if(arr.length==1)return (long)Math.abs(arr[0]-brr[0]);
        int n=arr.length;
        long bawaal=0;
        for(int i=0;i<n;i++){
            bawaal+=Math.abs(arr[i]-brr[i]);
        }
        Arrays.sort(arr);
        Arrays.sort(brr);
         long ans=k;
        
        for(int i=0;i<n;i++){
            ans+=Math.abs(arr[i]-brr[i]);
        }
        long real=Math.min(ans,bawaal);
        return real;
    }
}