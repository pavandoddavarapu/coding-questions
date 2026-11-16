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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int i=0;
        while(!q.isEmpty()){
            int a=q.size();
            if(i%2==0){
                int x=Integer.MIN_VALUE;
                int j=0;
                while(j<a){
                    TreeNode t=q.poll();
                    if(t.val%2==0)return false;
                    if(t.left!=null)q.add(t.left);
                    if(t.right!=null)q.add(t.right);
                    if(t.val<=x){return false;}
                    else{x=t.val;}
                    j++;
                }
            }
            else{
                int x=Integer.MAX_VALUE;
                int j=0;
                while(j<a){
                    TreeNode t=q.poll();
                    if(t.val%2!=0)return false;
                    if(t.left!=null)q.add(t.left);
                    if(t.right!=null)q.add(t.right);
                    if(t.val>=x){return false;}
                    else{x=t.val;}
                    j++;
                }
            }
            i++;
        }
        return true;
    }
}