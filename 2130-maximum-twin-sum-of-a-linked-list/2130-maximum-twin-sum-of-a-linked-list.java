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
    public int pairSum(ListNode head) {
        Stack<Integer> hs=new Stack<>();
        ListNode slow=head;
        ListNode fast=head;
        int n=0;
        while(fast!=null && fast.next!=null){
            hs.add(slow.val);
            slow=slow.next;

            fast=fast.next.next;
        }
        int ans=0;
        while(slow!=null){
            ans=Math.max(slow.val+hs.pop(),ans);slow=slow.next;
        }
        return ans;
    }
}