class Solution {
    public int minAddToMakeValid(String s) {
        int n=s.length();
        Stack<Character>st=new Stack<>();
        st.push(s.charAt(0));
        for(int i=1;i<n;i++){
            if(s.charAt(i)=='('){
                if((!st.isEmpty())&&st.peek()==')'){
                   st.push(s.charAt(i));
                }
                else{
                    st.push(s.charAt(i));
                }
            }
            else{
               if((!st.isEmpty())&&st.peek()=='('){
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                } 
            }
        }
        return st.size();
    }
}