class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int n=dominoes.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            int x=dominoes[i][0];
            int y=dominoes[i][1];
            for(int j=i+1;j<n;j++){
                int k=dominoes[j][0];
                int l=dominoes[j][1];
                if((x==k&&y==l)||(x==l&&y==k))cnt++;
            }
        }
        return cnt;
    }
}