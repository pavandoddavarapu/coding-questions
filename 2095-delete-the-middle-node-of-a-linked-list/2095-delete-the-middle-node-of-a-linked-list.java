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
    public ListNode deleteMiddle(ListNode head) {
        int len=0;
        ListNode temp=head;

        while(temp!=null){
            temp=temp.next;
            len++;
        }
        temp=head;
        len=len/2;
        int i=0;
        while(i<len-1 && temp!=null){
            temp=temp.next;i++;
        }
        if(temp==null)return temp;
        if(temp.next!=null)temp.next=temp.next.next;
        else{head=null;}
        return head;
    }
}