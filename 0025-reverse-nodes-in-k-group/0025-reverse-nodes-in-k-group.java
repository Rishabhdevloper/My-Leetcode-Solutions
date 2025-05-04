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
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev; // fix: reverse link
            prev = curr;
            curr = next;
        }
        return prev;
    } 
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
        ListNode kthNode=f(temp,k);
            if(kthNode==null){
                if(prev!=null){
                    prev.next=temp;
                    break;
                }
         
            }
           ListNode nextNode=kthNode.next;
            kthNode.next=null;
           ListNode reverseHead = reverse(temp);
            if(temp==head){
               head = reverseHead;
            }
            else{
                prev.next=reverseHead;
            }
            prev=temp;
            temp=nextNode;
        }



        

    

      return head;  
    }
}