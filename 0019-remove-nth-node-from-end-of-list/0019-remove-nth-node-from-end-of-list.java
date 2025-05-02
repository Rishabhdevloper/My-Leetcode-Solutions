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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=0;
        if(head==null)return head;
        if(head.next==null)return null;
        ListNode temp=head;
        while(temp!=null){
             len++;
            temp=temp.next;
        }
        System.out.print(len);
        int curr=(len-n+1);
        temp=head;
        int len2=1;
        while(temp!=null&&len2<curr-1){
            len2++;
            temp=temp.next;
        
        }
        if(curr==1){
            head=head.next;
        }
       else if(temp.next==null){
        temp=null;
       }
       else if(temp.next.next==null){
        temp.next=null;
       }
       else{
        temp.next=temp.next.next;
       }
       return head;
    }
}