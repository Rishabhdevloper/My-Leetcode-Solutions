class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int maxii=Integer.MIN_VALUE;

        int nse[]=new int[n];
        int pse[]=new int[n];
        Stack<Integer>st=new Stack<>();
        Stack<Integer>gt=new Stack<>();
        //nse banaya
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&&heights[st.peek()]>=heights[i]){
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
        //pse banaya..
        for(int i=0;i<n;i++){
            while(!gt.isEmpty()&&heights[gt.peek()]>heights[i]){
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
        for(int i=0;i<n;i++){
            maxii=Math.max(maxii,heights[i]*(nse[i]-pse[i]-1));
        }
       return maxii;
      
    }
}