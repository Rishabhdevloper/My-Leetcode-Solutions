class Solution {
    public int countPalindromicSubsequence(String s) {
        int n=s.length();
        HashSet<String>set=new HashSet<>();
        int pref[]=new int[26];//abcdefghijklmnopqrstuvwxyz
        int suff[]=new int[26];//abcdefghijklmnopqrstuvwxyz
        for(int i=0;i<n;i++){
            pref[s.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++){
            pref[s.charAt(i)-'a']--;
            for(int j=0;j<26;j++){
                if(pref[j]>0&&suff[j]>0){
                    String ans=""+(char)(j-'a')+s.charAt(i)+(char)(j-'a');
                    set.add(ans);
                }
            }
            suff[s.charAt(i)-'a']++;
        }
        return set.size();
    }
}