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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        helper(root,arr,0);
        return arr;
    }
    public void helper(TreeNode root,List<Integer> arr,int level){
        if(root==null)return;
        if(arr.size()==level)arr.add(root.val);
        helper(root.right,arr,level+1);
        helper(root.left,arr,level+1);

    }
}