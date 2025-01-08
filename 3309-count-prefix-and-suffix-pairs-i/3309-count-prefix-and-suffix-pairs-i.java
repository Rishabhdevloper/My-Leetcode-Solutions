class Solution {
            public boolean f(String a,String b){
                if(b.startsWith(a)&&b.endsWith(a)){
                    return true;
                }
                return false;
            }


    public int countPrefixSuffixPairs(String[] words) {
        int n=words.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            String ans=words[i];
            for(int j=i+1;j<n;j++){
                if(f(ans,words[j])){
                   cnt++;
                }
            }
        }
        return cnt;
    }
}