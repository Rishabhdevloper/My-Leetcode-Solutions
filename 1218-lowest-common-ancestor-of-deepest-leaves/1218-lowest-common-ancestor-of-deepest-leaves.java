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
class Solution {
     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null||root==p||root==q)return root;
        TreeNode a=lowestCommonAncestor(root.left,p,q);
        TreeNode b=lowestCommonAncestor(root.right,p,q);
        if(a==null){
            return b;
        }
       else if(b==null){
            return a;
        }
        else{
            return root;
        }

        
    }
    public int f(TreeNode root) {
        if(root==null)return 0;
        int a=f(root.left);
        int b=f(root.right);

        return 1+Math.max(a,b);
    
}
    public TreeNode lcaDeepestLeaves(TreeNode root) {
       int depth=f(root);
       Queue<TreeNode>pq=new LinkedList<>();
       pq.add(root);
       ArrayList<TreeNode>list=new ArrayList<>();
       int level=1;
       while(!pq.isEmpty()){
           int sze=pq.size();
           for(int i=0;i<sze;i++){
             TreeNode a=pq.poll();
             if(level==depth){
                list.add(a);
             }
             if(a.left!=null){
                pq.add(a.left);
             }
             if(a.right!=null){
                pq.add(a.right);
             }
           }
           level++;
       }
       if(list.size()==1)return list.get(0); 
       else{
        TreeNode ans=lowestCommonAncestor(root,list.get(0),list.get(list.size()-1));
        return ans;
       }
    
    }
}