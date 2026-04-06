/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
} */

class Solution {
    int maxDia=0;
    public int diameter(Node root) {
        // code here
        helper(root);
        return maxDia;
    }
    public int helper(Node root){
        if(root==null)return 0;
        int leftDia=helper(root.left);
        int rightDia=helper(root.right);
        int localDia=leftDia+rightDia;
        if(localDia>maxDia)maxDia=localDia;
        return Math.max(rightDia,leftDia)+1;
    }
}