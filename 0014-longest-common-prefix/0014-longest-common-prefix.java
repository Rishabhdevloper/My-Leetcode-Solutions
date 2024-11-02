class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            String str=strs[i];
            int x=str.length();
           mini=Math.min(mini,x);
        }
        String first=strs[0];
        StringBuilder jj=new StringBuilder();
        boolean flag=true;
        for(int i=0;i<mini;i++){
            char ch=first.charAt(i);
            for(int j=1;j<n;j++){
                String arr=strs[j];
                if(ch!=arr.charAt(i)){
                   flag=false;
                   break;
                }
            }
            if(flag){
                jj.append(ch);
            }
        }
        return jj.toString();
    }
}