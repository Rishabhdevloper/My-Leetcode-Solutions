class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n=words.length;
        int ans[]=new int[n];
        int answer[]=new int[queries.length];
        int pref[]=new int[n];
        String vowel="aeiou";
        for(int i=0;i<words.length;i++){
            String str=words[i];
            if(vowel.contains(String.valueOf(str.charAt(0)))&&vowel.contains(String.valueOf(str.charAt(str.length()-1)))){
                ans[i]=1;
            }
        }
        pref[0]=ans[0];
        for(int i=1;i<n;i++){
            pref[i]=ans[i]+pref[i-1];
        }
        for(int i=0;i<queries.length;i++){
            int x=queries[i][0];
            int y=queries[i][1];
            if(x==0){
                answer[i]=pref[y];
            }
            else{
                answer[i]=pref[y]-pref[x-1];
            }
        }
        return answer;
    }
}