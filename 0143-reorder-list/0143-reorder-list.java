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
    public void reorderList(ListNode head) {
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        temp=head;
        int k=0;
        while(k<len/2){
            temp=temp.next;
            k++;
        }
        ListNode reversed=reverseList(temp.next);
        temp.next=null;
        ListNode ans=head;
        ListNode first = head;
        ListNode second = reversed; // This is the head of the reversed half
        while (second != null) {
    ListNode t1 = first.next;
    ListNode t2 = second.next;

    first.next = second;
    second.next = t1;

    first = t1;
    second = t2;
}

        return ;

    }

    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode prev=null;
        ListNode curr=head;
        ListNode currnext=curr.next;
        while(curr!=null){
            currnext=curr.next;
            curr.next=prev;


            prev=curr;
            curr=currnext;
            if(currnext!=null)currnext=currnext.next;
        }
        return prev;
    }
}