class Solution {
    public int maxScore(String s) {
      int n=s.length();
      int maxi=0;
      char arr[]=s.toCharArray();
      int pref[]=new int[n];
      int suff[]=new int[n];
      int ans[]=new int[n];
      boolean flag=false;
      if(arr[0]=='0'){
        pref[0]=1;
      }
      if(arr[n-1]=='1'){
        suff[n-1]=1;
      }
      for(int i=1;i<n;i++){
        if(arr[i]=='0'&&i!=n-1){
            pref[i]=pref[i-1]+1;
        }
        else{
            pref[i]=pref[i-1];
        }
      }
      for(int i=n-2;i>=0;i--){
        if(arr[i]=='1'&&i!=0){
            suff[i]=suff[i+1]+1;
        }
        else{
            suff[i]=suff[i+1];
        }
      }
      for(int i=0;i<n;i++){
        if(pref[i]+suff[i]>maxi){
            maxi=pref[i]+suff[i];
        }
      }
      
       return maxi;   
    }
}