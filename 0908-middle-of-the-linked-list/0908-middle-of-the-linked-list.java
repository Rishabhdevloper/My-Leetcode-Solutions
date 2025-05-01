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
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int cnt=0;
        int ans=0;
        while(temp!=null){
            temp=temp.next;
            cnt++;
        }
        if(cnt%2==1){
          ans=((cnt+1)/2);
          System.out.print(ans);
        }
        else{
            ans=(cnt/2)+1;
        }
      ListNode a = head;
int i = 1;
while(i < ans) { 
    a = a.next;
    i++;
}
return a;

     
    }
}