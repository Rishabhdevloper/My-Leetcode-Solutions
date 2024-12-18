class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder str=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)=='('&&st.size()>=1){
                st.push(s.charAt(i));
                str.append(s.charAt(i));
            }
            else if(s.charAt(i)==')'&&st.size()>=1){
                if(st.peek()=='('&&st.size()>=1){
                    st.pop();
                }
                if(st.size()>=1){
                str.append(s.charAt(i));
                }
            }  
        }
        return str.toString();
    }
}