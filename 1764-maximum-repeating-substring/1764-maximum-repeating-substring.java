class Solution {
    public int maxRepeating(String sequence, String word) {
        int ans=0;
        String str=word;
        while(true){
            if(sequence.contains(str)){
                ans++;
               str+=word;
            }
            else{
                break;
            }

        }
        return ans;
    }
}