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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        helper(root,target);
        if(root!=null && root.left==null && root.right==null &&root.val==target)return null;
        return root;
    }
    public boolean helper(TreeNode root,int target){
        if(root==null)return false;
        boolean a=helper(root.left,target);
        boolean b=helper(root.right,target);
        if(a)root.left=null;
        if(b)root.right=null;
        if(root.left==null && root.right==null && root.val==target)return true;
        return false;
    }
}