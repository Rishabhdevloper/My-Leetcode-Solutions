class Solution {
    public static boolean check(int start,int color[],List<List<Integer>>adj,int V){
        Queue<Integer>pq=new LinkedList<>();
        pq.add(start);
        color[start]=0;
        while(!pq.isEmpty()){
            int node=pq.peek();
            pq.remove();
            for(int it:adj.get(node)){
                if(color[it]==-1){
                    color[it]=1-color[node];
                    pq.add(it);
                }
                else if(color[node]==color[it])return false;
            }
        }
        return true;
    }




    public boolean isBipartite(int[][] graph) {
        int V=graph.length;
        int d=graph[0].length;
        int color[]=new int[V];
        for(int i=0;i<V;i++){
            color[i]=-1;
        }
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<V;i++){
             adj.add(new ArrayList<Integer>());
         }
        for(int i=0;i<V;i++){
            for(int j=0;j<graph[i].length;j++){
                adj.get(i).add(graph[i][j]);
            }         
        }
        for(int i=0;i<V;i++){
            if(color[i]==-1){
            if(check(i,color,adj,V)==false){
                return false;
            }
            }
        }
        return true;
    }
}
// class Solution {
//     public boolean isBipartite(int[][] graph) {
//         int n=graph.length;
//         ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
//         for(int i=0;i<n;i++){
//             adj.add(new ArrayList<>());
//         }

//         for(int i=0;i<n;i++){
//             for(int j=0;j<graph[i].length;j++){
//                 adj.get(i).add(graph[i][j]);
//             }
//         }
        
//         int color[]=new int[n+1];
//         Arrays.fill(color,-1);

//         for(int i=0;i<n;i++){
//             if(color[i]==-1){
//                 if(checkBipartite(i,adj,color)==false){
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
// // colors a component 
//     public boolean checkBipartite(int i,ArrayList<ArrayList<Integer>>adj,int color[]){
//         Queue<Integer>q=new LinkedList<>();
//         q.add(i);
//         color[i]=0;

//         while(!q.isEmpty()){
//             int node=q.poll();
            
//             for(int e:adj.get(node)){
//                 if(color[e]==-1){// if the adjacent node is yet not colored
//                     color[e]=1-color[node];// you will give the opposite color of the node 
//                     q.add(e);
//                 }
//                 else if(color[e]==color[node]){// is the adjacent guy having the same color 
//                     return false;
//                 }
//             }
            
//         }
//         return true;

//     }