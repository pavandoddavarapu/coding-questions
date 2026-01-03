/*
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
*/
class Solution {
    public Node flatten(Node root) {
        // code here
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        Node tempn=root;
        
        while(tempn!=null){
            Node tempb=tempn;
            while(tempb!=null){
                pq.add(tempb.data);
                tempb=tempb.bottom;
            }
            tempn=tempn.next;
        }
        Node head=new Node(1);
        Node ne=head;
        while(!pq.isEmpty()){
            // int a=pq.peek(pq.poll(););
            Node n=new Node(pq.poll());
            ne.bottom=n;
            ne=ne.bottom;
            
            
        }
        return head.bottom;
    }
}