class Solution {
    class pair{
        int k;
        int a;
        pair(int k,int a){
            this.k=k;
            this.a=a;
        }
    }
    public boolean isNStraightHand(int[] hand, int groupSize) {
        TreeMap<Integer,Integer> tm=new TreeMap<>();
        for(int a:hand){
            tm.put(a,tm.getOrDefault(a,0)+1);
        }
        while(tm.size()>0){
            int k=tm.firstKey();
            int a=tm.get(k);
            tm.remove(k);
            System.out.print(k+" ");
            int i=1;
            ArrayList<pair> arr=new ArrayList<>();
            while(i<groupSize){
                if(tm.isEmpty())return false;
                int km=tm.firstKey();
                int am=tm.get(km);
                tm.remove(km);
                if(km!=k+i)return false;
                if(am-a<0)return false;
                arr.add(new pair(km,am-a));
                i++;
            }
            for(int j=0;j<arr.size();j++){
                if(arr.get(j).a!=0)tm.put(arr.get(j).k,arr.get(j).a);
            }
        }
        return true;
    }
}