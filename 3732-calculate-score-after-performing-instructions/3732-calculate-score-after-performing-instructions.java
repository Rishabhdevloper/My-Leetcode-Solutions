class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        int n=instructions.length;
        long score=0;
        int i=0;
        int arr[]=new int[n];
        while(i>=0&&i<n){  
            if(arr[i]==1)break; 
            if(instructions[i].equals("jump")){
               arr[i]=1;
                i+=values[i];
                
            }
            else{
                score+=(values[i]);
                arr[i]=1;
                i++;
                
            }
        }
        return score;

    }
}