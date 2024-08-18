class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<n;i++){
          if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
            st.push(s.charAt(i));
          }
          else{
            if(s.charAt(i)==')'){
                if(!st.isEmpty()){
                if(st.peek()=='('){
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
                }
                else{
                    st.push(s.charAt(i));
                }
            }
           else if(s.charAt(i)==']'){
             if(!st.isEmpty()){
                if(st.peek()=='['){
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
                }
                else{
                    st.push(s.charAt(i));
                }
            }
            else if(s.charAt(i)=='}'){
                 if(!st.isEmpty()){
                if(st.peek()=='{'){
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
                 }
                 else{
                    st.push(s.charAt(i));
                 }
            }
            else{
                st.push(s.charAt(i));
            }
          }

        }
        if(st.isEmpty()){
            return true;
        }
      return false;  
    }
}