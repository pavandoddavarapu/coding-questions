class Solution {
    public class pair{
        int frq;
        Character c;
        pair(int f,char ch){
            this.frq=f;
            this.c=ch;
        }
    }
    public int minimumPushes(String word) {
        char[] ch=word.toCharArray();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char c:ch){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        ArrayList<pair> arr=new ArrayList<>();
        for(Map.Entry<Character,Integer> entry:hm.entrySet()){
            arr.add(new pair(entry.getValue(),entry.getKey()));
        }
        Collections.sort(arr,(a,b)->b.frq-a.frq);
        int k=0;
        int count=0;
        for(int i=0;i<arr.size();i++){
            int m=arr.get(i).frq;
            if(k<8){
                count=count+m;
                k++;
            }
            else if(k>=8 && k<16){
                count=count+(2*m);
                k++;
            }
            else if(k>=16 && k<24){
                count=count+(3*m);
                k++;
            }
            else{
                count=count+(m*4);
                k++;
            }
            System.out.print(count+" ");
        }
        return count;
    }
}