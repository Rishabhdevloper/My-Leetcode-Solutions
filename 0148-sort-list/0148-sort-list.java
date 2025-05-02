/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        ArrayList<Integer>list=new ArrayList<>();
        if(head==null)return null;
        ListNode tem=head;
        while(tem!=null){
            list.add(tem.val);
            tem=tem.next;
        }
        Collections.sort(list);
    ListNode head1=new ListNode(list.get(0));
    ListNode temp=head1;
     for(int i=1;i<list.size();i++){
         ListNode a=new ListNode(list.get(i));
         temp.next=a;
        temp=temp.next;
     }


return head1;
    }
}