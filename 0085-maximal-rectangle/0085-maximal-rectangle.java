class Solution {
     public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int maxii=Integer.MIN_VALUE;

        int nse[]=new int[n];
        int pse[]=new int[n];
        Stack<Integer>st=new Stack<>();
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
        while(!st.isEmpty())st.pop();
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&heights[st.peek()]>heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i]=-1;
            }
            else{
               pse[i]=st.peek();
            }
            st.push(i);
        }
        for(int i=0;i<n;i++){
            maxii=Math.max(maxii,heights[i]*(nse[i]-pse[i]-1));
        }
       return maxii;
     }

    public int maximalRectangle(char[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int oper[][]=new int[n][m];
        for(int i=0;i<n;i++){
               for(int j=0;j<m;j++){
                oper[i][j]=matrix[i][j]-'0';
               }
        }
        //Prefix sum matrix ban gayi...
        int sum=0;
        for(int i=0;i<m;i++){
            sum=0;
               for(int j=0;j<n;j++){
                sum+=oper[j][i];
                if(oper[j][i]==0)sum=0;
                oper[j][i]=sum;
               }
        }
        int maxo=0;
        for(int i=0;i<n;i++){
           maxo=Math.max(maxo,largestRectangleArea(oper[i]));
        }
        return maxo;

    }
}