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
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean flag=true;
        while(!q.isEmpty()){
            int n=q.size();
            int i=0;
            List<Integer> subans=new ArrayList<>();
            while(i<n){
                TreeNode tn=q.poll();
                if(tn.left!=null){q.add(tn.left);}
                if(tn.right!=null){q.add(tn.right);}
                i++;
                subans.add(tn.val);
            }
            if(flag){ans.add(subans);flag=false;}
            else{Collections.reverse(subans);ans.add(subans);flag=true;}
        }
        return ans;
    }
}