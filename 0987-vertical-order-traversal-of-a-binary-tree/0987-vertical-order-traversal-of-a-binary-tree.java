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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null)return result;
        TreeMap<Integer,TreeMap<Integer,ArrayList<Integer>>> tmap=new TreeMap<>();
        //column
        //row
        //ArrayList
        dfs(root,tmap,0,0);
        for(Map.Entry<Integer,TreeMap<Integer,ArrayList<Integer>>> col: tmap.entrySet()){
            TreeMap<Integer,ArrayList<Integer>> tm=col.getValue();
            ArrayList<Integer> list=new ArrayList<>();
            for(Map.Entry<Integer,ArrayList<Integer>> row: tm.entrySet()){

                ArrayList<Integer> sublist=row.getValue();
                Collections.sort(sublist);
                list.addAll(sublist);

            }
            result.add(list);

        }
        return result;
    }
    public void dfs(TreeNode root,TreeMap<Integer,TreeMap<Integer,ArrayList<Integer>>> tmap,int i,int j){
        if(root==null)return ;
        if(tmap.containsKey(i)){
            if(tmap.get(i).containsKey(j)){
                tmap.get(i).get(j).add(root.val);
            }
            else{
                ArrayList<Integer> arr=new ArrayList<>();
                arr.add(root.val);
                tmap.get(i).put(j,arr);
            }
        }
        else{
            ArrayList<Integer> arr=new ArrayList<>();
            arr.add(root.val);
            TreeMap<Integer,ArrayList<Integer>>tp=new TreeMap<>();
            tp.put(j,arr);
            tmap.put(i,tp);
        }
        dfs(root.left,tmap,i-1,j+1);
        dfs(root.right,tmap,i+1,j+1);
        return;
    }
}