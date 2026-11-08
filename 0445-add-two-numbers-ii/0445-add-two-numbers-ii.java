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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1=reverse(l1);
        l2=reverse(l2);
        int count=0;
        ListNode ans=new ListNode(0);
        ListNode dum=ans;
        while(l1!=null && l2!=null){
            int a=l1.val+l2.val+count;
            if(a>9){count=1;dum.next=new ListNode(a%10);}
            else{dum.next=new ListNode(a);count=0;}
            dum=dum.next;
            l1=l1.next;
            l2=l2.next;
        }
         while(l1!=null){
            int a=l1.val+count;
            if(a>9){count=1;dum.next=new ListNode(a%10);}
            else{dum.next=new ListNode(a);count=0;}
            dum=dum.next;
            l1=l1.next;
            
        }
         while(l2!=null){
            int a=l2.val+count;
            if(a>9){count=1;dum.next=new ListNode(a%10);}
            else{dum.next=new ListNode(a);count=0;}
            dum=dum.next;
            l2=l2.next;
        }
        if(count!=0){dum.next=new ListNode(count);}
        return reverse(ans.next);
    }
    public ListNode reverse(ListNode l1){
        if(l1==null)return null;
        ListNode curr=l1;
        ListNode prev=null;
        ListNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        return prev;
    }
}