class Solution {
    public boolean doesAliceWin(String s) {
        boolean flag=true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                flag=false;
                break;
            }
        }
        if(flag){
            return false;
        }
        return true;
    }
}