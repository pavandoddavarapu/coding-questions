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
    public boolean isValidBST(TreeNode root) {
        // if(root==null)
        List<Integer> ls=new ArrayList<>();
        helper(root,ls);
        int a=Integer.MIN_VALUE;
        for(int i=1;i<=ls.size()-1;i++){
            if(ls.get(i)<=ls.get(i-1))return false;
        }
        return true;
    }
    public void helper(TreeNode root,List<Integer> ls){
        if(root==null)return;
        helper(root.left,ls);
        ls.add(root.val);
        System.out.println(root.val);
        helper(root.right,ls);
        return;
    }
}