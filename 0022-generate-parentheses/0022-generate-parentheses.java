class Solution {
     public static boolean isValid(String s) {
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

    public static void f(int n,ArrayList<String>list,StringBuilder str){
        if(str.length()==2*n){
            if(isValid(str.toString())){
                list.add(str.toString());
            }
            return;
        }
        str.append('(');
        f(n,list,str);
         str.deleteCharAt(str.length() - 1);
         str.append(')');
        f(n,list,str);
        str.deleteCharAt(str.length() - 1);
    }
    public List<String> generateParenthesis(int n) {
       ArrayList<String>list=new ArrayList<>();
       StringBuilder str=new StringBuilder();
       f(n,list,str);

    return list;
      }
}