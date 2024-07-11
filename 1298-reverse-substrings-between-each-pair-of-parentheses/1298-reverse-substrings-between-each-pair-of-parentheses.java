class Solution {
    public String reverseParentheses(String s) {
        int n=s.length();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<n;i++){ 
            if(s.charAt(i)==')'){ 
                String str="";  
                while(st.peek()!='('){
                    str+=st.peek();
                    st.pop();
                }
                st.pop();
               for(int j=0;j<str.length();j++){
                st.push(str.charAt(j));
               }
                 
            }
            else{
                st.push(s.charAt(i));
            }
        }

        StringBuilder curr=new StringBuilder();
        while(!st.isEmpty()){
            curr.append(st.peek());
            st.pop();
        }
        return curr.reverse().toString();
    }
}