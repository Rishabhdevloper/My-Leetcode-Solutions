class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int pref[]=new int[n];
        int suff[]=new int[n];
        int curr=0;
        int extra=0;
        for(int i=0;i<n;i++){
           curr+=extra;
           pref[i]=curr;
           if(boxes.charAt(i)=='1'){
            extra++;
           }
        }
        curr=0;
        extra=0;
        for(int i=n-1;i>=0;i--){
            curr+=extra;
            suff[i]=curr;
            if(boxes.charAt(i)=='1'){
            extra++;
           }
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=pref[i]+suff[i];
        }
        return ans;
    }
}