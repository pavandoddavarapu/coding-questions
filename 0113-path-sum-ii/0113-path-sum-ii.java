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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(root,targetSum,ans);
        return ans;
    }
    List<Integer> ls=new ArrayList<>();
    public void helper(TreeNode root, int targetSum,List<List<Integer>> ans){
        if(root==null)return;
        ls.add(root.val);
        if(targetSum-root.val==0 && root.left==null && root.right==null){List<Integer> ls1=new ArrayList<>(ls);ans.add(ls1);}
        helper(root.left,targetSum-root.val,ans);
        helper(root.right,targetSum-root.val,ans);
        ls.remove(ls.size()-1);
        return;

    }
}