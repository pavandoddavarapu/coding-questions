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
    public TreeNode replaceValueInTree(TreeNode root) {
        int ans[]=new int[100000+1];
        helper1(root,ans,0);
        
        helper2(root,ans,0);
        root.val=0;
        return root;
    }
    public void helper1(TreeNode root,int ans[],int i){
        if(root==null)return;
        ans[i]=ans[i]+root.val;
        helper1(root.left,ans,i+1);
        helper1(root.right,ans,i+1);
    }
    public void helper2(TreeNode root,int ans[],int i){
        if(root==null)return;
        
        if(root.left!=null && root.right!=null){
            int val=ans[i+1]-root.left.val-root.right.val;
            root.left.val=val;
            root.right.val=val;
        }
        else if(root.left!=null){
            root.left.val=ans[i+1]-root.left.val;
        }
        else if(root.right!=null){
            root.right.val=ans[i+1]-root.right.val;
        }
       

        helper2(root.left,ans,i+1);
        helper2(root.right,ans,i+1);
    }
}