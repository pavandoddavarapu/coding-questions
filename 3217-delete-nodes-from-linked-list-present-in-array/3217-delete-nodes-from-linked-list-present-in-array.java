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
        int arr[]=new int[1000000+1];

        for(int a:nums)arr[a]=1;
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            if(arr[temp.next.val]!=0){
                ListNode t=temp.next;
                temp.next=temp.next.next;
                t.next=null;}
            else{
                temp=temp.next;
            }
        }
        if(head!=null){if(arr[head.val]!=0)head=head.next;}
        return head;
    }
}