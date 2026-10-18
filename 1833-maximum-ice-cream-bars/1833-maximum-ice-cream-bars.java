class Solution {
    public int maxIceCream(int[] costs, int coins) {
        TreeMap<Integer,Integer> hm=new TreeMap<>();
        for(int a:costs){
            
            if(a<=coins)hm.put(a,hm.getOrDefault(a,0)+1);
        }
        int count=0;
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            int b=entry.getKey();
            int a=entry.getValue();
            while(coins-b>=0 && a>0){coins=coins-b;count++;a--;}
        }
        // for(int i=1;i<arr.length;i++){
        //     int a=arr[i];
        //     while(coins-i>=0 && a>0){coins=coins-i;count++;a--;}
        // }
        return count;
    }
}