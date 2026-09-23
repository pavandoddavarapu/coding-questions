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
    public int deepestLeavesSum(TreeNode root) {
      
        int ma=helper(root);
        helper2(root,1,ma);
      
        return count;
    }
    int count=0;
    public int helper(TreeNode root){
        if(root==null)return 0;
        return Math.max(helper(root.left),helper(root.right))+1;
    }
    public void helper2(TreeNode root,int level,int ma){
        if(root==null)return;
        if(level==ma)count=count+root.val;
        helper2(root.left,level+1,ma);
        helper2(root.right,level+1,ma);
        return;
    }
}