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
    public List<List<String>> printTree(TreeNode root) {
        height(root,0);
        List<List<String>> ls=new ArrayList<>();
        for(int i=0;i<ans+1;i++){
            List<String> sub=new ArrayList<>();
            for(int j=0;j<Math.pow(2,ans+1)-1;j++){
                sub.add("");
            }
            ls.add(sub);
        }
        int n=ls.get(0).size();
        helper(root,ls,0,(n-1)/2,ans);
        return ls;

    }
    public void helper(TreeNode root,List<List<String>> ls,double i,double j,int h){
        if(root==null)return;
        ls.get((int)i).set((int)j, root.val + "");

        helper(root.left,ls,i+1,j-Math.pow(2,h-i-1),h);
        helper(root.right,ls,i+1,j+Math.pow(2,h-i-1),h);
    }
    int ans=0;
    public void height(TreeNode root,int sum){
        if(root==null){ans=Math.max(ans,sum-1);return;}
        height(root.left,sum+1);
        height(root.right,sum+1);

    }
}