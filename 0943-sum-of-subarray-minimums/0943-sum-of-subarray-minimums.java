class Solution {
    public int sumSubarrayMins(int[] arr) {
       int n=arr.length;

        int nse[]=new int[n];
        int pse[]=new int[n];
        Stack<Integer>st=new Stack<>();
        Stack<Integer>gt=new Stack<>();
        //nse banaya
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&&arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i]=n;
            }
            else{
               nse[i]=st.peek();
            }
            st.push(i);
        }
        for(int i=0;i<n;i++){
            while(!gt.isEmpty()&&arr[gt.peek()]>arr[i]){
                gt.pop();
            }
            if(gt.isEmpty()){
                pse[i]=-1;
            }
            else{
               pse[i]=gt.peek();
            }
            gt.push(i);
        }
        long total=0;
        int mod=(int)(1e9+7);
        for(int i=0;i<n;i++){
            int left=i-pse[i];
            int right=nse[i]-i;
            total+=(long)(left*right)%mod*arr[i]%mod;
            total=total%mod;
        }
        return (int)total;
    }
}