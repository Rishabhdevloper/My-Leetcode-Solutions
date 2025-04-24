class Solution {
    public int maximumPossibleSize(int[] nums) {
        int n=nums.length;
        Stack<Integer>st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            if(st.isEmpty()){
                st.push(nums[i]);
            }
            else if(st.peek()<nums[i]){
                while(!st.isEmpty()&&st.peek()<nums[i]){
                    st.pop();
                }
                st.push(nums[i]);

            }
            else{
                st.push(nums[i]);
            }
        }
       return st.size();
    } 
}