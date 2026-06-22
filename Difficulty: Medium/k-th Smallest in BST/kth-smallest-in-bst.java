/*
Definition for Node
class Node {
    int data;
    Node left, right;

    public Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int kthSmallest(Node root, int c) {
        // code here
        k=c;
        helper(root);
        return r==null?-1:r.data;
    }
    int k=0;
    Node r=null;
    public void helper(Node root){
        if(root==null || k==0)return;
        helper(root.left);
        k--;
        if(k==0){r=root;return;}
        helper(root.right);
        
    }
}