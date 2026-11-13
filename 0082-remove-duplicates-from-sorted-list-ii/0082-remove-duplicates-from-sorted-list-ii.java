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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dump=head;
        int prev=-101;
        while(head!=null && head.next!=null){
            if(head.val==head.next.val){
                prev=head.val;
                head.val=-101;
                
            }
            else if(head.val==prev){
                head.val=-101;
            }
            head=head.next;
        }
        if(head!=null && head.val==prev){
                head.val=-101;
            }
        while(dump!=null && dump.val==-101){
            dump=dump.next;
        }
        if(dump==null)return dump;
        ListNode h=dump;
        while(dump!=null){
            if(dump.next!=null && dump.next.val==-101){
                ListNode k=dump;
                dump=dump.next;
                while(dump!=null && dump.val==-101)dump=dump.next;
                k.next=dump;
            }
            else{
            dump=dump.next;}
        }
        return h;
    }
}