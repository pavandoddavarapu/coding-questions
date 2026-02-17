class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length())return false;
        HashMap<Character,Integer> hm1=new HashMap<>();
        HashMap<Character,Integer> hm2=new HashMap<>();
        char w1[]=word1.toCharArray();
        char w2[]=word2.toCharArray();
        for(int i=0;i<w1.length;i++){
            hm1.put(w1[i],hm1.getOrDefault(w1[i],0)+1);
            hm2.put(w2[i],hm2.getOrDefault(w2[i],0)+1);
        }
        ArrayList<Integer> c1=new ArrayList<>(hm1.values());
        ArrayList<Integer> c2=new ArrayList<>(hm2.values());
        ArrayList<Character> d1=new ArrayList<>(hm1.keySet());
        ArrayList<Character> d2=new ArrayList<>(hm2.keySet());
        Collections.sort(d1);
        Collections.sort(d2);
        Collections.sort(c1);
        Collections.sort(c2);
        for(int i=0;i<c1.size();i++){
            System.out.println(c1.get(i)+"  "+c2.get(i));
            if(!c1.get(i).equals(c2.get(i)))return false;
        }
        for(int i=0;i<d1.size();i++){
            System.out.println(d1.get(i)+"  "+d2.get(i));
            if(d1.get(i)!=d2.get(i))return false;
        }
        return true;
    }
}