/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 class Tuple{
   TreeNode node;
    int vertical;
    int left;
    Tuple(TreeNode _node,int _vertical,int _left){
        this.node=_node;
        this.vertical=_vertical;
        this.left=_left;
    }
 }




class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Queue<Tuple>pq=new LinkedList<>();
        Map<Integer,TreeMap<Integer,PriorityQueue<Integer>>>map=new TreeMap<>();
        pq.add(new Tuple(root,0,0));
        while(pq.size()>0){
            Tuple ans=pq.remove();
           TreeNode a=ans.node;
            int b=ans.vertical;
            int c=ans.left;
            if(!map.containsKey(b)){
                map.put(b,new TreeMap<>());
            }
            if(!map.get(b).containsKey(c)){
                map.get(b).put(c,new PriorityQueue<>());
            }
            map.get(b).get(c).add(a.val);
            if(a.left!=null){
                pq.add(new Tuple(a.left,b-1,c+1));
            }
            if(a.right!=null){
                pq.add(new Tuple(a.right,b+1,c+1));
            }
        }
        List<List<Integer>>list=new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>>mp:map.values()){
             ArrayList<Integer>li=new ArrayList<>();
             for(PriorityQueue<Integer>nodes:mp.values()){
                while(!nodes.isEmpty()){
                    li.add(nodes.peek());
                    nodes.poll();
                }
             }
             list.add(li);
        }

    return list;
    }
}