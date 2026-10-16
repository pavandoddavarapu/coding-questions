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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> hs=new HashSet<>();
        for(int a:nums)hs.add(a);
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            if(hs.contains(temp.next.val)){
                ListNode t=temp.next;
                temp.next=temp.next.next;
                t.next=null;}
            else{
                temp=temp.next;
            }
        }
        if(head!=null){if(hs.contains(head.val))head=head.next;}
        return head;
    }
}