class Solution {
    public int[] decode(int[] encoded, int first) {
        int n=encoded.length;
        int answer[]=new int[n+1];
        
        answer[0]=first;
        for(int i=0;i<n;i++){
           int xor=answer[i]^encoded[i];
            answer[i+1]=xor;
        }
        return answer;
    }
}