class Solution {
    public static boolean f(String ans,String b){
        for(int i=0;i<b.length();i++){
            if(b.charAt(i)=='I'&&ans.charAt(i)>ans.charAt(i+1))return false;
            if(b.charAt(i)=='D'&&ans.charAt(i)<ans.charAt(i+1))return false;  
        }
        return true;
    }
      private void nextPermutation(char[] num) {
        int i = num.length - 2;
        while (i >= 0 && num[i] >= num[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = num.length - 1;
            while (num[j] <= num[i]) {
                j--;
            }
            swap(num, i, j);
        }
        reverse(num, i + 1);
    }

    private void swap(char[] num, int i, int j) {
        char temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }

    private void reverse(char[] num, int start) {
        int end = num.length - 1;
        while (start < end) {
            swap(num, start++, end--);
        }
    }
    public String smallestNumber(String pattern) {
        int n=pattern.length();
        char ans[]=new char[n+1];
        for(int i=0;i<=n;i++){
            ans[i]=(char)('1'+i);
        }
       while(!f(new String(ans),pattern)){
        nextPermutation(ans);
       }
       return new String(ans);




        
    }
}