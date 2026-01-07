class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<k;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else{hm.put(arr[i],1);}
        }
        ans.add(hm.size());
        for(int i=k;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else{hm.put(arr[i],1);}
            if(hm.get(arr[i-k])==1){
                hm.remove(arr[i-k]);
            }
            else{
                hm.put(arr[i-k],hm.get(arr[i-k])-1);
            }
            ans.add(hm.size());
        }
        return ans;
    }
}