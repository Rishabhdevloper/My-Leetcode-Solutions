class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=i;
        int n=s.length();
         HashSet<Character>set=new HashSet<>();
         if(n==0)return 0;
        int maxi=1;
        while(i<=j&&i<n&&j<n){
            if(set.contains(s.charAt(j))){
                i++;
                j=i;
                set.clear();
            }
            else{
                 maxi=Math.max(maxi,j-i+1);
                set.add(s.charAt(j));
                j++;
            }
        }
        return maxi;
    }
}