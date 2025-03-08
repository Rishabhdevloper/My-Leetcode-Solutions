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
    public static TreeNode helper(int[] preorder,int prel,int preh,int inorder[],int inl,int inh){
        if(prel>preh)return null;
         TreeNode root=new TreeNode(preorder[prel]);
         int i=inl;
         while(preorder[prel]!=inorder[i])i++;

         int left=i-inl;
         root.left=helper(preorder,prel+1,prel+left,inorder,inl,i-1);
         root.right=helper(preorder,prel+left+1,preh,inorder,i+1,inh);
         

        return root;

    }




    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length;
        int prel=0;
        int preh=n-1;
        int inl=0;
        int inh=n-1;
        return helper(preorder,prel,preh,inorder,inl,inh);
    }
}