class Solution {
    public double averageWaitingTime(int[][] customers) {
        int finishingtime=customers[0][1]+customers[0][0];
        int n=customers.length;
        int m=customers[0].length;
        ArrayList<Integer>list=new ArrayList<>();
        list.add(customers[0][1]);
        for(int i=1;i<n;i++){
            if(customers[i][0]>finishingtime){
                finishingtime=customers[i][0]+customers[i][1];
                list.add(finishingtime-customers[i][0]);
            }
            else{
            finishingtime+=customers[i][1] ;  
            list.add(finishingtime-customers[i][0]);
        }
        }
        double sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        double ans=sum/list.size();
        return ans;


    }
}