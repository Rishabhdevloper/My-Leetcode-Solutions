class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int answer[]=new int[n];
      for(int i=0;i<n;i++){
        int cnt=0;
        for(int j=0;j<n;j++){
            if(j!=i){
                if(boxes.charAt(j)=='1'){
                    cnt+=(Math.abs(i-j));
                }
            }
        }
        answer[i]=cnt;
      } 

      return answer;
    }
}