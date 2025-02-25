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
 class Pair{
    TreeNode node;
    int num;
    Pair(TreeNode node,int num){
        this.node=node;
        this.num=num;
    }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair>pq=new LinkedList<>();
        if(root==null)return 0;
        pq.add(new Pair(root,0));
        int ans=0;
        while(pq.size()>0){
            int size=pq.size();
            int mmin=pq.peek().num;
            int first=0;
            int last=0;
           for(int i=0;i<size;i++){
            int curr=pq.peek().num-mmin;
            TreeNode nod=pq.peek().node;
            pq.poll();
            if(i==0)first=curr;
            if(i==size-1)last=curr;
            if(nod.left!=null){
                pq.add(new Pair(nod.left,curr*2+1));
            } 
            if(nod.right!=null){
                pq.add(new Pair(nod.right,curr*2+2));
            } 




           }
           ans=Math.max(last-first+1,ans);

        }


 return ans;
    }
}