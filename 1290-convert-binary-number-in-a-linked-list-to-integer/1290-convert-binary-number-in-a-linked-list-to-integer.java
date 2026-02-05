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
    public int getDecimalValue(ListNode head) {
        int a=0;
        while(head!=null){
            int b=head.val;
            a= b==0 ? (a << 1) & ~1 : (a<<1)|1;
            head=head.next;

        }
        return a;
    }
}