class Solution {
    public int takeCharacters(String s, int k) {
     int n=s.length();
     int countA=0;
     int countB=0;
     int countC=0;
     for(int i=0;i<n;i++){
        if(s.charAt(i)=='a')countA++;
        if(s.charAt(i)=='b')countB++;
        if(s.charAt(i)=='c')countC++;
     }
     if(countA<k)return -1;
     if(countB<k)return -1;
     if(countC<k)return -1;
     int i=0;
     int j=0;
     int del=0;
     while(j<n){
           if(s.charAt(j)=='a')countA--;
           else if(s.charAt(j)=='b')countB--;
           else if(s.charAt(j)=='c')countC--;
           while(i<=j&&(countA<k||countB<k||countC<k)){
             if (s.charAt(i) == 'a') {
                    countA++;
                } else if (s.charAt(i) == 'b') {
                    countB++;
                } else if (s.charAt(i) == 'c') {
                    countC++;
                }
                i++;
           }
           del=Math.max(del,j-i+1);
           j++;
     }
     return n-del;
     
    }
}