class Solution {
    public int maxFreqSum(String s) {
        int arr[]=new int[26];
        int n=s.length();
        for(int i=0;i<n;i++){
            int a=s.charAt(i)-'a';
            arr[a]++;
        }
        int maxi1=0;
        int maxi2=0;
        for(int i=0;i<26;i++){
            char x=(char)(i+'a');
            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'){
              maxi1=Math.max(maxi1,arr[i]);
            }
        }
        for(int i=0;i<26;i++){
            char x=(char)(i+'a');
            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'){
             continue;
            }
             maxi2=Math.max(maxi2,arr[i]);
        }
        return maxi1+maxi2;
    }
}