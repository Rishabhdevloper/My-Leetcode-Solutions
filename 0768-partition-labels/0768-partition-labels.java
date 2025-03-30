class Solution {
    public List<Integer> partitionLabels(String s) {
        int n=s.length();
        int arr[][]=new int[26][2];
        for(int i=0;i<26;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=-1;
            }
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[s.charAt(i)-'a'][0]==-1){      
                arr[s.charAt(i)-'a'][0]=i;
                 arr[s.charAt(i)-'a'][1]=i;
            }
            else{
                    arr[s.charAt(i)-'a'][1]=i;
            }
        }
        int st=arr[s.charAt(0)-'a'][0];
        int end=arr[s.charAt(0)-'a'][1];
        for(int i=0;i<n;i++){
               if(i<=end){
                end=Math.max(end,arr[s.charAt(i)-'a'][1]);
               }
               else{
                list.add(end-st+1);
                st=arr[s.charAt(i)-'a'][0];
                end=arr[s.charAt(i)-'a'][1];
               }
        }
        list.add(end-st+1);
        return list;


    }
}