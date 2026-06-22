class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<text.length();i++){
            Character c=text.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        int count=0;
        while(true){
            String st="balloon";
            for(int i=0;i<st.length();i++){
                Character c=st.charAt(i);
                if(hm.containsKey(c)){
                    if(hm.get(c)==1){hm.remove(c);}
                    else{hm.put(c,hm.get(c)-1);}
                }
                else{return count;}
            }
            count++;
        }
        
    }
}