class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int n=str1.length();
        int m=str2.length();
        boolean flag=false;
        int i=0;
         int j=0;
        while(j<m&&i<n){
            if(Math.abs(str2.charAt(j)-str1.charAt(i))==0){
                i++;
                j++;
            }
            else if(str2.charAt(j)-str1.charAt(i)==1){
                i++;
                j++;
            }
            else if(str2.charAt(j)=='a'&&str1.charAt(i)=='z'){
                i++;
                j++;
            }
            else{
                i++;
            }

        }
        if(j==m){
            return true;
        }
        return false;

    }
}