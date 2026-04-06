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

        int level=0;
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)return ans;
        q.add(root);
        while(!q.isEmpty()){
            int s=q.size();
            ArrayList<Integer> arr=new ArrayList<>();
            for(int i=0;i<s;i++){
                TreeNode r=q.poll();
                if(r.left!=null){q.add(r.left);}
                if(r.right!=null){q.add(r.right);}
                arr.add(r.val);

            }
            if(level%2==0){ans.add(arr);}
            else{Collections.reverse(arr);ans.add(arr);}
            level++;
        }
        return ans;
    }
}