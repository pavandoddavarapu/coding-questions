class Solution {
    public class pair{
        int a;
        char c;
        pair(int a,char c){
            this.a=a;
            this.c=c;
        }
    }
    public String sortVowels(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        char c[]=s.toCharArray();
        HashMap<Character,Integer> hk=new HashMap<>();
        for(int i=c.length-1;i>=0;i--){
            char ch=c[i];
            if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u')hk.put(ch,i);
        }
        for(char ch:c){
            if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u')hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        ArrayList<pair> arr=new ArrayList<>();
        for(Map.Entry<Character,Integer> entry:hm.entrySet()){
            arr.add(new pair(entry.getValue(),entry.getKey()));
        }
        Collections.sort(arr,(a,b)->{
            if(a.a!=b.a)return b.a-a.a;
            else return hk.get(a.c)-hk.get(b.c);
            });
        int j=0;
        for(int i=0;i<c.length;i++){
            while(j<arr.size() && arr.get(j).a==0)j++;
            char ch=c[i];
            if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u'){c[i]=arr.get(j).c;arr.get(j).a--;}
        }
    return new String(c);
    }
}