class Solution {
    public double averageWaitingTime(int[][] customers) {
        int finishingtime=customers[0][1]+customers[0][0];
        int n=customers.length;
        int m=customers[0].length;
        
        double sum=customers[0][1];
        double count=1;
        for(int i=1;i<n;i++){
            if(customers[i][0]>finishingtime){
                finishingtime=customers[i][0]+customers[i][1];
                sum+=(finishingtime-customers[i][0]);
                count++;
            }
            else{
            finishingtime+=customers[i][1] ;  
            sum+=(finishingtime-customers[i][0]);
            count++;
        }
        }
        double ans=sum/count;
        return ans;


    }
}