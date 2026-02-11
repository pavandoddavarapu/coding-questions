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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> ls=new ArrayList<>();
        if(root==null)return ls;
        
        q.add(root);
        q.add(null);
        List<Integer> ans=new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode r=q.poll();
            if(q.isEmpty()&& r==null){ls.add(ans);return ls;}
            else if(r==null){q.add(r);ls.add(ans);ans=new ArrayList<>();}
            else{ans.add(r.val);
            if(r.left!=null)q.add(r.left);
            if(r.right!=null)q.add(r.right);}
        }
        return ls;
    }
}