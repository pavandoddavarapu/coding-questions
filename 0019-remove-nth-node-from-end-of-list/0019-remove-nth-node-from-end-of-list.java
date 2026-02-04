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
        if(head.next==null)return head.next;
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        if(n==count)return head.next;
        temp=head;
        int i=1;
        while(i<count-n){
            temp=temp.next;
            i++;
        }
        if(temp==null ||temp.next==null)return head;
        
        else{
            ListNode t=temp.next;
            temp.next=temp.next.next;
            t.next=null;
        }

        System.out.print(count);
        return head;
    }
}