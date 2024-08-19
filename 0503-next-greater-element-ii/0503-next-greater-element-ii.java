class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int nge1[]=new int[n];
        int ans[]=new int[2*n];
        int nge2[]=new int[2*n];
        Stack<Integer>st=new Stack<>();
        int j=0;
        for(int i=0;i<n;i++){
            ans[j++]=nums[i];
        }
        for(int i=0;i<n;i++){
            ans[j++]=nums[i];
        }
        for(int i=2*n-1;i>=0;i--){
            while(!st.isEmpty()&&st.peek()<=ans[i]){
                  st.pop();
            }
            if(st.isEmpty())nge2[i]=-1;
            else{
                nge2[i]=st.peek();
            }
            st.push(ans[i]);

            
        }
         for(int i=0;i<n;i++){
            nge1[i]=nge2[i];
         }
         return nge1;
    }
}