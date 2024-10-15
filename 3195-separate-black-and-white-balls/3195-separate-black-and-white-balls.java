class Solution {
    public long minimumSteps(String s) {
    long swap=0;
    long black=0;
    int n=s.length();
    for(int i=0;i<n;i++){
    if(s.charAt(i)=='0'){
        swap+=black;
    }
    else{
        black++;
    }
    }
    return swap;
    }
}