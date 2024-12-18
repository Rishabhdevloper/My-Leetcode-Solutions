class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder str=new StringBuilder();
       Stack<Integer>st=new Stack<>();
       HashSet<Integer>set=new HashSet<>();
       int n=s.length();
       for(int i=0;i<n;i++){
        if(s.charAt(i)=='('){
            st.push(i);
        }
        else if(s.charAt(i)==')'){
            if(st.isEmpty()){
                set.add(i);
            }
            else{
                st.pop();
            }
        }
       }
       while(!st.isEmpty()){
        set.add(st.peek());
        st.pop();
       } 
       for(int i=0;i<n;i++){
        if(set.contains(i)){
            continue;
        }
        else{
            str.append(s.charAt(i));
        }
       }
       return str.toString();
    }
}