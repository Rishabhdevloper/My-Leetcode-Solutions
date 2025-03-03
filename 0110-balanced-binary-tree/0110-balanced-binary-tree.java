class Solution {
    public  int height(TreeNode root){
        if(root==null)return 0;
        return 1+ Math.max(height(root.left),height(root.right));

    }
    public boolean isBalanced(TreeNode root) {
        if(root==null )return true;
        int lh=height(root.left);
        int rh=height(root.right);
        if(Math.abs(lh-rh)>1)return false;
        boolean left=isBalanced(root.left);
        boolean right=isBalanced(root.right);
        return left&&right;
    }
}