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
}
*/

class Solution {
    public int findMedian(Node root) {
        // Code here
        count=0;
        helper1(root);
        if(count%2==0){
            k=count/2;
            return helper2(root).data;
        }
        else{
            k=(count+1)/2;
            return helper2(root).data;
        }
        
    }
    int count=0;
    int k=0;
    public void helper1(Node root){
        if(root==null)return;
        helper1(root.left);
        count++;
        helper1(root.right);
        return;
    }
    public Node helper2(Node root){
        if(root==null)return null;
        Node left=helper2(root.left);
        k--;
        if(k==0)return root;
        Node right=helper2(root.right);
        if(left!=null)return left;
        else if(right!=null)return right;
        return null;
    }
}