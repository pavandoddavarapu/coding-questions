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
    public ListNode reverseList(ListNode head) {
        ListNode newhead=null;
        ListNode temp=newhead;
        while(head!=null){
            ListNode newn=new ListNode(head.val);
            newn.next=temp;
            head=head.next;
            temp=newn;
        }
        return temp;
    }
}