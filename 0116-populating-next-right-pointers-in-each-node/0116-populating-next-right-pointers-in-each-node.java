/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Queue<Node>pq=new LinkedList<>();
        if(root==null)return null;
        pq.add(root);
        while(pq.size()>0){
            int len=pq.size();
           
            for(int i=0;i<len;i++){
                Node first=pq.poll();
                 if(first.left!=null){
                pq.add(first.left);
            }
            if(first.right!=null){
                pq.add(first.right);
            }
            if(i!=(len-1)){
                first.next=pq.peek();
            }
                if(i==len-1){
                    first.next=null;
                }
            }
        }
        return root;
    }
}