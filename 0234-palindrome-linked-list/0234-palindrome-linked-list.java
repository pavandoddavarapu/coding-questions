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
    public boolean isPalindrome(ListNode head) {
        if(head==null)return false;
        if(head.next==null)return true;
        ListNode slow=head;
        ListNode fast=head;
        do{
            slow=slow.next;
            fast=fast.next.next;
        }while(fast!=null && fast.next!=null);
        ListNode temp=slow;
        

        temp=reverseList(temp);
        while(head!=null && temp!=null){
            if(head.val!=temp.val)return false;
            System.out.println(head.val+ " " +temp.val);
            head=head.next;
            temp=temp.next;
        }
        return true;
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