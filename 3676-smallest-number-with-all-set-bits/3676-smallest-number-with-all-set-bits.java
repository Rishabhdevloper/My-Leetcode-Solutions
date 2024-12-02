class Solution {
    public int smallestNumber(int n) {
        ArrayList<Integer>list=new ArrayList<>();
        while(n>0){
            list.add(n%2);
            n=n/2;
        }
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        int ans=0;
        int j=0;
        for(int i=0;i<list.size();i++){
            ans+=(int)Math.pow(2,j);
            j++;
        }
        return ans;
    }
}