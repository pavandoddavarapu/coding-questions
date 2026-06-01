/*
class Node {
    int data;
    Node left, right,next;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    Node prev=null;
    public void populateNext(Node root) {
        // code here
        prev=null;
        helper(root);
    }
    public void helper(Node root){
        if(root==null)return;
        helper(root.left);
        if(prev!=null)prev.next=root;
        prev=root;
        helper(root.right);
    }
}