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
    public List<List<Integer>> levelOrder(TreeNode root) {
      List<List<Integer>>list=new ArrayList<>();
      Queue<TreeNode>pq=new LinkedList<>();
      if(root!=null){
        pq.add(root);
      }
      while(pq.size()>0){
        int s=pq.size();
        
        ArrayList<Integer>li=new ArrayList<>();
        for(int i=0;i<s;i++){
           TreeNode nod=pq.poll();
           li.add(nod.val);
           if(nod.left!=null){
            pq.add(nod.left);
           }
           if(nod.right!=null){
            pq.add(nod.right);
           }
        }
        list.add(li);
      }
      return list;
    }
}