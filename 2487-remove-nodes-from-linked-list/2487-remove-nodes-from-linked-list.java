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
    public ListNode removeNodes(ListNode head) {
        ListNode h1=reverser(head);
        int ans=0;
        ListNode temp=h1;
        ListNode prev=null;
        while(h1!=null){
            if(h1.val<ans){prev.next=h1.next;h1=h1.next;}
            else{
                
                ans=h1.val;
                prev=h1;
                h1=h1.next;
                
            }
        }
        return reverser(temp);
    }
    public ListNode reverser(ListNode head){
        if(head==null)return head;
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}