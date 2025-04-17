class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans=1;
        int n=s.length();
        int i=0;
        int j=0;
        HashSet<Character>set=new HashSet<>();
        if(s.length()==0)return 0;

        while(j<n){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                ans=Math.max(ans,set.size());
                j++;
            }
            else{
               set.clear();
               i++;
               j=i; 

            }
        }
        return ans;
    }
}