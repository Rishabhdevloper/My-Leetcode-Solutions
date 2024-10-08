class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
         int n=players.length;
        int m=trainers.length;
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i=0;
        int j=0;
        int count=0;

        while(i<n&&j<m){
          if(trainers[j]>=players[i]) {
             count++;
             i++;
             j++;
          }
          else if(trainers[j]<players[i]){
            j++;
          }   
        }
        return count;
    }
}