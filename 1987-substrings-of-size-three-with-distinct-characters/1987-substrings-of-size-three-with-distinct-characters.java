class Solution {
    public int countGoodSubstrings(String s) {
        int cnt=0;
        int n=s.length();
        int i=0;
        int j=2;
      while(j<n){
            if(s.charAt(i)!=s.charAt(j)&&s.charAt(i)!=s.charAt(i+1)&&s.charAt(i+1)!=s.charAt(j)){
                 cnt++;
            }
            i++;
            j++;
        }
        return cnt;
    }
}