class Solution {
    public int numberOfSubstrings(String s) {
       int n=s.length();
       int freq[]=new int[3];
       Arrays.fill(freq,-1);
       int cnt=0;
       for(int i=0;i<n;i++){
           freq[s.charAt(i)-'a']=i;
            if(freq[0]!=-1&&freq[1]!=-1&&freq[2]!=-1){
           cnt+=(1+Math.min(Math.min(freq[0],freq[1]),freq[2]));
            }

       }
       return cnt;
    }
}