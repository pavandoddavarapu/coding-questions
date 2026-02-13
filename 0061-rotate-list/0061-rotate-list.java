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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0)return head;
        int len=0;
        ListNode temp=head;
        ListNode t=head;
        while(temp!=null){
            if(temp.next==null)t=temp;
            len++;
            temp=temp.next;
        }
        k=k%len;
        temp=head;
        int i=0;
        while(i<len-k-1){temp=temp.next;i++;}
        ListNode ans=temp.next;
        temp.next=null;
        t.next=head;
        return ans;

    }
}