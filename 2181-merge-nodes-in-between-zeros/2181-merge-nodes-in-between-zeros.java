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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head;
        while(temp.next!=null){
            if(temp.next.val==0 || temp.val==0){temp=temp.next;}
            else{
                temp.val=temp.val+temp.next.val;
                ListNode t=temp.next;
                temp.next=temp.next.next;
                t.next=null;

            }
        }
        temp=head;
        while(temp.next!=null){
            if(temp.next.val==0)temp.next=temp.next.next;
            else temp=temp.next;
        }
        return head.next;
    }
}