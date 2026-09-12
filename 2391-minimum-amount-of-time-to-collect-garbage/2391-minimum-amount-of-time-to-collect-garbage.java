class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int count=0;
        int m=0;
        int p=0;
        int g=0;
        for(int i=0;i<garbage.length;i++){
            String a=garbage[i];
            if(a.contains("M"))m=i;
            if(a.contains("P"))p=i;
            if(a.contains("G"))g=i;
            count=count+a.length();
        }
        
        for(int i=1;i<travel.length;i++){
            travel[i]=travel[i-1]+travel[i];
        }
        if(m !=0)count=count+travel[m-1];
        if(p !=0)count=count+travel[p-1];
        if(g !=0)count=count+travel[g-1];
        return count;
    }
}