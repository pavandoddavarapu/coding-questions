/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        helper(head);
        return head;
    }
    public void helper(Node head){
        if(head==null) return;
        if(head.next==null && head.child==null){
            return ;
        }
        if(head.next==null && head.child!=null){head.next=head.child;head.child=null;head.next.prev=head;}
        if(head.child!=null){
            Node temp=head.next;
            Node c=head.child;
            Node h=head.child;
            while(h.next!=null){
                h=h.next;
            }
            
            head.next.prev=h;
            h.next=head.next;
            head.child=null;
            head.next=c;
            c.prev=head;

        }
        helper(head.next);

    }
}