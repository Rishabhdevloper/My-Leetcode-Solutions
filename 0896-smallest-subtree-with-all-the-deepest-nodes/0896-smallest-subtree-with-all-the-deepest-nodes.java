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
     public int f(TreeNode root) {
        if(root==null)return 0;
        int a=f(root.left);
        int b=f(root.right);

        return 1+Math.max(a,b);
    
}
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
         if(root==null)return null;
       int a=f(root.left);
       int b=f(root.right);
       if(a==b)return root;
       if(a>b){
        return subtreeWithAllDeepest(root.left);
       }
       else{
        return subtreeWithAllDeepest(root.right);
       }

    }
}