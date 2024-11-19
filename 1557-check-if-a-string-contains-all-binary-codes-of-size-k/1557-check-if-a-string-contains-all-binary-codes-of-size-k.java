class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String>set=new HashSet<>();
        int ans=(int)Math.pow(2,k);
        int n=s.length();
        if(k>n)return false;
        set.add(s.substring(0,k));
        int i=1;
        int j=k;
        
        while(j<n){
            set.add(s.substring(i,j+1));
            i++;
            j++;
        }
        if(set.size()==ans)return true;
        return false;

    }
}