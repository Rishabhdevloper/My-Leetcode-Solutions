class Solution {
    public int countOfSubstrings(String word, int k) {
        int n=word.length();
        int left=0;
        int right=0;
        int count=0;
        int p=k;
        HashSet<Character>set=new HashSet<>();
        while(left<n){
            if(word.charAt(right)=='a'||word.charAt(right)=='e'||word.charAt(right)=='i'||word.charAt(right)=='o'||word.charAt(right)=='u'){
                set.add(word.charAt(right));
            }
            else{
                p--;
            }
            if(set.contains('a')&&set.contains('e')&&set.contains('i')&&set.contains('o')&&set.contains('u')&&p==0){
                count++;
                right++;
            }
            else if(p<0){
                left++;
                right=left;
                p=k;
                set.clear();
            }
            else{
                right++;
            }
            if(right>=n){
                left++;
                right=left;
                p=k;
                set.clear();
            }
        }
        return count;
    }
}