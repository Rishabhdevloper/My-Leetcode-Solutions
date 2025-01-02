class Solution {
    public int maxScore(String s) {
      int n=s.length();
      int maxi=0;
      char arr[]=s.toCharArray();
      int pref[]=new int[n];
      int suff[]=new int[n];
      int ans[]=new int[n];
      boolean flag=false;
      HashSet<Character>set=new HashSet<>();
      for(int i=0;i<n;i++){
        set.add(arr[i]);
      }
      if(set.size()==1){
        maxi=n-1;
      }
      else if(n==2){
        if(arr[0]=='0'&&arr[1]=='1'){
            maxi=2;
        }
      }
      else{
      if(arr[0]=='0'){
        pref[0]=1;
      }
      if(arr[n-1]=='1'){
        suff[n-1]=1;
      }
      for(int i=1;i<n;i++){
        if(arr[i]=='0'){
            pref[i]=pref[i-1]+1;
        }
        else{
            pref[i]=pref[i-1];
        }
      }
      for(int i=n-2;i>=0;i--){
        if(arr[i]=='1'){
            suff[i]=suff[i+1]+1;
        }
        else{
            suff[i]=suff[i+1];
        }
      }
      for(int i=1;i<n-1;i++){
        if(pref[i]+suff[i]>maxi){
            maxi=pref[i]+suff[i];
        }
      }
      }
       return maxi;   
    }
}