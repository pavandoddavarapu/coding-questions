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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)return ans;
        boolean flag=true;
        ArrayList<Integer> ls=new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode r=q.poll();
            if(r==null){
                if(flag){ans.add(ls);flag=false;}
                else{Collections.reverse(ls);ans.add(ls);flag=true;}
                if(!q.isEmpty())q.add(null);
                ls=new ArrayList<>();
            }
            else{
                ls.add(r.val);
                if(r.left!=null)q.add(r.left);
                if(r.right!=null)q.add(r.right);
            }
        }
        return ans;
    }
}