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
    public ListNode doubleIt(ListNode head) {
        ListNode h=reverser(head);
        ListNode ans=h;
        int carry=0;
        while(h!=null){
            int a=h.val*2+carry;
            if(a>9){carry=1;h.val=a%10;}
            else{carry=0;h.val=a;}
            h=h.next;
            
        }
        ans=reverser(ans);
        if(carry!=0){ListNode temp=new ListNode(1);temp.next=ans;ans=temp;}
        return ans;
    }
    public ListNode reverser(ListNode head){
        ListNode curr=head;
        ListNode next=null;
        ListNode prev=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}