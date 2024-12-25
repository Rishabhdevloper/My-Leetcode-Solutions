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
    public List<Integer> largestValues(TreeNode root) {
        ArrayList<Integer>list=new ArrayList<>();
        Queue<TreeNode>pq=new LinkedList<>();
        if(root!=null){
            pq.add(root);
        }
        int maxi=Integer.MIN_VALUE;
        while(pq.size()>0){
            int len=pq.size();
            maxi=Integer.MIN_VALUE;
           for(int i=0;i<len;i++){
            if(pq.peek().left!=null){
                pq.add(pq.peek().left);
            }
            if(pq.peek().right!=null){
                pq.add(pq.peek().right);
            }
            maxi=Math.max(maxi,pq.peek().val);
            pq.remove();
           }
           list.add(maxi);
            
        }
        return list;

    }
}