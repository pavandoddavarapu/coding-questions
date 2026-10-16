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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(0);
        if(head==null || head.next==null)return head;
        dummy.next=head;
        head=head.next;
        while(dummy!=null && dummy.next!=null && dummy.next.next!=null){
            ListNode k=dummy.next;
            ListNode h=dummy.next.next;
            dummy.next=h;
            k.next=h.next;
            h.next=k;
            dummy=k;
        }
        return head;
    }
}