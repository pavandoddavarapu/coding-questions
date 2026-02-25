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
        List<List<Integer>> result= new ArrayList<>();
        TreeMap<Integer,TreeMap<Integer,ArrayList<Integer>>> tmap=new TreeMap<>();
        dfs(root,tmap,0,0);
        //column wise sorting
        for(Map.Entry<Integer,TreeMap<Integer,ArrayList<Integer>>> col : tmap.entrySet()){
            TreeMap<Integer,ArrayList<Integer>> tm= col.getValue();
            ArrayList<Integer> list=new ArrayList<>();
            for(Map.Entry<Integer,ArrayList<Integer>> row : tm.entrySet()){
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
            TreeMap<Integer,ArrayList<Integer>> row=tmap.get(i);
            if(row.containsKey(j)){
                tmap.get(i).get(j).add(root.val);
            }
            else{ArrayList<Integer> ls=new ArrayList<>();ls.add(root.val);tmap.get(i).put(j,ls);}

        }
        else{
            TreeMap<Integer,ArrayList<Integer>> row=new TreeMap<>();
            ArrayList<Integer> ls=new ArrayList<>();
            ls.add(root.val);
            row.put(j,ls);
            
            tmap.put(i,row);
        }
        dfs(root.left,tmap,i-1,j+1);
        dfs(root.right,tmap,i+1,j+1);
    }

}