/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    public boolean isBalanced(Node root) {
        // code here
        helper(root);
        return flag;
    }
    boolean flag=true;
    public int helper(Node root){
        if(root==null)return 0;
        int left=helper(root.left);
        int right=helper(root.right);
        if(Math.abs(left-right)>1)flag=false;
        return Math.max(left,right)+1;
    }
}