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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int ans[][]=new int[m][n];
        int left=0;
        int right=n-1;
        int up=0;
        int bottom=m-1;
        while(up<=bottom && left<=right){
            for(int  i=left;i<=right;i++){
                if(head!=null){
                ans[up][i]=head.val;
                head=head.next;}
                else{ans[up][i]=-1;}
            }
            up++;
            for(int i=up;i<=bottom;i++){
                if(head!=null){
                ans[i][right]=head.val;
                head=head.next;}
                else{ans[i][right]=-1;}
            }
            right--;
            if(up<=bottom){
            for(int i=right;i>=left;i--){
                if(head!=null){
                ans[bottom][i]=head.val;
                head=head.next;}
                else{ans[bottom][i]=-1;}
            }
            bottom--;}
            if(left<=right){
            for(int i=bottom;i>=up;i--){
                if(head!=null){
                ans[i][left]=head.val;
                head=head.next;}
                else{ans[i][left]=-1;}
            }
            left++;}
        }
        return ans;
    }
}