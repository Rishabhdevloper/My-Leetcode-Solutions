class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long z=k;
        int n=chalk.length;
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=chalk[i];
        } 
        z=z%sum;
         for(int i=0;i<n;i++){
            if(chalk[i]>z)return i;
            z=z-chalk[i];
        } 
        
    
    return -1;
    }
}