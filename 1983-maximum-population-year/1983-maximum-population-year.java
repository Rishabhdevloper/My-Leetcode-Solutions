class Solution {
    public int maximumPopulation(int[][] logs) {
        int arr[]=new int[2051];
        int n=logs.length;
        for(int i=0;i<n;i++){
            int x=logs[i][0];
            int y=logs[i][1];
            arr[x]++;
            arr[y]--;
        }
        int currentYear=0;
        int extension=0;
        int maxi=0;
        for(int i=0;i<2051;i++){
           extension+=arr[i];
           if(extension>maxi){
            maxi=Math.max(extension,maxi);
            currentYear=i;
           }

        }

        return currentYear;
    }
}