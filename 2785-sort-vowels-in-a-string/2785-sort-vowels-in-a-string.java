class Solution {
    public String sortVowels(String s) {
        char ch[]=s.toCharArray();
        ArrayList<Character> arr=new ArrayList<>();
        for(int i=0;i<ch.length;i++){
            char c=ch[i];
            if(c=='a' || c=='e' ||c=='i' ||c=='o' ||c=='u' ||c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U')arr.add(c);
           
        }
        int k=0;
        Collections.sort(arr);
        for(int i=0;i<ch.length;i++){
            char c=ch[i];
            if(c=='a' || c=='e' ||c=='i' ||c=='o' ||c=='u' ||c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U'){
                ch[i]=arr.get(k);
                k++;
            }
        }
        return new String(ch);
    }
}