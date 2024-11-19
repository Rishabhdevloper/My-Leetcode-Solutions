class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int n=derived.length;
        int answer1[]=new int[n];
        int answer2[]=new int[n];
        answer1[0]=1;
        answer2[0]=0;
        boolean flag1=true;
        boolean flag2=true;
        for(int i=0;i<n-1;i++){
            answer1[i+1]=answer1[i]^derived[i];
        }
        
        for(int i=0;i<n;i++){
            if(i==n-1){
                if(derived[i]!=(answer1[0]^answer1[i])){
                    flag1=false;
                }
            }
            else{
               if(derived[i]!=(answer1[i+1]^answer1[i])){
                flag1=false;
               }
            }
        }
        for(int i=0;i<n-1;i++){
            answer2[i+1]=answer2[i]^derived[i];
        }
        for(int i=0;i<n;i++){
            if(i==n-1){
                if(derived[i]!=(answer2[i]^answer2[0])){
                    flag2=false;
                }
            }
            else{
               if(derived[i]!=(answer2[i+1]^answer2[i])){
                flag2=false;
               }
            }
        }
        if(flag1==true||flag2==true){
            return true;
        }
        return false;

        
        
    }
}