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
    public ListNode oddEvenList(ListNode head) {
        int len=0;
        ListNode temp=head;
        ListNode last=temp;
        while(temp!=null){len++;last=temp;temp=temp.next;}
        temp=head;
        int i=0;
        if(len==2)return head;
        while(i<len/2){
            ListNode t=temp.next;
            temp.next=temp.next.next;
            t.next=null;
            last.next=t;
            last=last.next;
            temp=temp.next;
            i=i+1;
        }
        return head;
    }
}