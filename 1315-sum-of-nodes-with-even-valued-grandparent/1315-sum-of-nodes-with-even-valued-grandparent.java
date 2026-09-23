/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumEvenGrandparent(TreeNode root) {
         helper(root);
         return count;
    }
    int count=0;
    public void helper(TreeNode root){
        if(root==null)return;
        if(root.val%2==0){
        if(root.left!=null){
            TreeNode r=root.left;
            if(r.left!=null){count=count+r.left.val;}
            if(r.right!=null){count=count+r.right.val;}
        }
        if(root.right!=null){
            TreeNode r=root.right;
            if(r.left!=null){count=count+r.left.val;}
            if(r.right!=null){count=count+r.right.val;}
        }}
        helper(root.left);
        helper(root.right);
    }
}