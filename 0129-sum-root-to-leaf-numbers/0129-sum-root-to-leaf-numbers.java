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

    public class pair{TreeNode node;int val;
    pair(TreeNode node,int val){
        this.node=node;
        this.val=val;
    }
    }
    
    public int sumNumbers(TreeNode root) {
        if(root==null)return 0;
        Queue<pair> q=new LinkedList<>();
        int sum=0;
        q.add(new pair(root,0));
        while(!q.isEmpty()){
            pair p1=q.poll();
            TreeNode p=p1.node;
            
            if(p.left==null && p.right==null){p1.val=p1.val*10+p.val;sum=sum+p1.val;System.out.print(p1.val+" "+sum+",");}
            if(p.left!=null){
                q.add(new pair(p.left,p1.val*10+p.val));
            }
            if(p.right!=null){
                q.add(new pair(p.right,p1.val*10+p.val));
            }

        }

        
        return sum;
    }
}