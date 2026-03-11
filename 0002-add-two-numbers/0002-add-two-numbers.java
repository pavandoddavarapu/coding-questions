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
        ListNode l3=new ListNode();
        ListNode temp=l3;
        int carry=0;
        while(l1!=null && l2!=null){
            
            int val=l1.val+l2.val+carry;
            if(val>9){
                 ListNode newnode=new ListNode(val%10);
                 temp.next=newnode;
                 temp=newnode;
                 carry=1;
                 l1=l1.next;
                 l2=l2.next;
                 continue;
            }
            carry=0;
            l1=l1.next;
            l2=l2.next;
            ListNode newnode=new ListNode(val);
            temp.next=newnode;
            temp=newnode;
        }
        while(l1!=null){
            int val=l1.val+carry;
            if(val>9){
                 ListNode newnode=new ListNode(val%10);
                 temp.next=newnode;
                 temp=newnode;
                 carry=1;
                 l1=l1.next;
                 continue;
            }
            carry=0;
            l1=l1.next;
            ListNode newnode=new ListNode(val);
            temp.next=newnode;
            temp=newnode;
        }
        while(l2!=null){
            int val=l2.val+carry;
            if(val>9){
                 ListNode newnode=new ListNode(val%10);
                 temp.next=newnode;
                 temp=newnode;
                 carry=1;
                 l2=l2.next;
                 continue;
            }
            carry=0;
            l2=l2.next;
            ListNode newnode=new ListNode(val);
            temp.next=newnode;
            temp=newnode;
        }
        if(carry==1){ListNode newnode=new ListNode(1);
            temp.next=newnode;
            temp=newnode;}
        return l3.next;
    }
}