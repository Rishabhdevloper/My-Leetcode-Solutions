class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int n=s1.length();
        int cnt=0;
        int left=0;
        int right=0;
        for(int i=0;i<n;i++){
            if(cnt==0&&s1.charAt(i)!=s2.charAt(i)){
                left=i;
                cnt++;
            }
            else if(cnt==1&&s1.charAt(i)!=s2.charAt(i)){
                right=i;
                cnt++;
                break;
            }
        }
        if(cnt==0)return true;
        else if(cnt==1)return false;
        else if(cnt==2){
              char arr[]=s1.toCharArray();
              char brr[]=s2.toCharArray();
              char temp=arr[left];
              arr[left]=arr[right];
              arr[right]=temp;
              for(int i=0;i<n;i++){
                if(arr[i]!=brr[i])return false;
              }
              return true;


        }

        

       return false; 
    }
}