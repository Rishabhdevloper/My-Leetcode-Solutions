class Solution {
    public int[] finalPrices(int[] prices) {
      int n=prices.length;
      int nse[]=new int[n];
      Stack<Integer>st=new Stack<>();
      for(int i=n-1;i>=0;i--){
        while(!st.isEmpty()&&st.peek()>prices[i]){
            st.pop();
        }
        if(st.isEmpty())nse[i]=-1;
        else{
            nse[i]=st.peek();
        }
        st.push(prices[i]);
      }
      for(int i=0;i<n;i++){
        if(nse[i]!=-1){
            prices[i]-=nse[i];
        }
      }
      return prices;
    }
}