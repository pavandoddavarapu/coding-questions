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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int i=0;
        ListNode temp1=list1;
        while(i<a-1){
            temp1=temp1.next;
            i++;
        }
        ListNode temp2=list1;
        int j=0;
        while(j<b){
            temp2=temp2.next;
            j++;
        }
        temp1.next=list2;
        while(list2.next!=null){list2=list2.next;}
        list2.next=temp2.next;
        System.out.println(temp1.val);
        System.out.println(temp2.val);
        return list1;
    }
}