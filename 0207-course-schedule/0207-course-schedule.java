class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj=new ArrayList<>();
        int V=numCourses;
        int n=prerequisites.length;
        
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        int indegree[]=new int[V];
       for(int i=0;i<V;i++){
           for(int it:adj.get(i)){
               indegree[it]++;
           }
       }
       Queue<Integer>q=new LinkedList<>();
       for(int i=0;i<V;i++){
           if(indegree[i]==0)q.add(i);
       }
       int topo[]=new int[V];
       int i=0;
       int cnt=0;
       while(!q.isEmpty()){
           int node=q.peek();
           q.remove();
           cnt++;
           
           topo[i++]=node;
           for(int it:adj.get(node)){
               indegree[it]--;
               if(indegree[it]==0){
                   q.add(it);
               }
           }
       }
       if(cnt==V)return true;
       return false;
    }
}