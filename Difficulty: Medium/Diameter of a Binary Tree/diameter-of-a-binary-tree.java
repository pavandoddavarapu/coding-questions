/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
} */

class Solution {
    int maxAs=0;
    
    public int diameter(Node root) {
        // code here
        helper(root);
        return maxAs;
        
    }
    public int helper(Node root){
        if(root==null)return 0;
        int left=helper(root.left);
        int right=helper(root.right);
        maxAs=Math.max(maxAs,left+right);
        return Math.max(left,right)+1;
    }
}