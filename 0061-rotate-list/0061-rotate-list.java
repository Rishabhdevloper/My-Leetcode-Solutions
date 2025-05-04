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
    public static ListNode f(ListNode  temp,int k){
         k=k-1;
         while(temp!=null&&k>0){
            k--;
            temp=temp.next;
         }
         return temp;
    }
       public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next=null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev; // fix: reverse link
            prev = curr;
            curr = next;
        }
        return prev;
    }




    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null)return head;
        ListNode t=head;
        ListNode prev=null;
        int len=0;
        while(t!=null){
            len++;
            t=t.next;
        }
        
        k=k%len;
        if(k>0){
        
        int val=len-k;
        ListNode temp=head;
        ListNode kthNode=f(temp,val);
         ListNode nextNode=kthNode.next;
         kthNode.next=null;
         ListNode reverseHead=reverse(temp);
          if(temp==head){
               head = reverseHead;
            }
            prev=temp;
            temp=nextNode;
             kthNode=f(temp,k);
            kthNode.next=null;
            ListNode reverseHead2=reverse(temp);
            prev.next=reverseHead2;
            reverse(head);
            head=temp;
        }



return head;
        
    }
}