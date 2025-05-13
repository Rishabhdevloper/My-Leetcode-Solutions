class Solution {
    public int lengthAfterTransformations(String s, int t) {
        int MOD = 1000000007;

        long[] freq = new long[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
       while(t-->0){
          long next[]=new long[26];
          for(int i=0;i<26;i++){
             if(i==25){
                 next[0]=(next[0]+freq[i])%MOD;
                 next[1]=(next[1]+freq[i])%MOD;

             }
             else{
                next[i+1]=(next[i+1]+(freq[i]))%MOD;
             }
          }
          freq=next;
       }
       long total=0;
       for(int i=0;i<26;i++){
            total=(total+freq[i])%MOD;
       }
       
       

        return (int) total;
    }
}
