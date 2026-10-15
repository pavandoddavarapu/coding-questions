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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int left=Integer.MAX_VALUE;
        int right=Integer.MAX_VALUE;
        ArrayList<Integer> arr=new ArrayList<>();
        int count=0;
        while(head!=null){
            count++;
            if(head.next!=null){right=head.next.val;}
            else{break;}
            int a=head.val;
            if(a>left && a>right){arr.add(count);}
            else if(count!=1 && a<left && a<right){arr.add(count);}
            left=a;
            head=head.next;
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.size()-1;i++){
            min=Math.min(min,arr.get(i+1)-arr.get(i));
        }
        for(int a:arr){
            System.out.print(a+",");
        }
        
        int ans[]=new int[2];
        if(arr.size()<=1){ans[0]=-1;ans[1]=-1;return ans;}
        int max=arr.get(arr.size()-1)-arr.get(0);
        ans[0]=min;
        ans[1]=max;
        return ans;
    }
}