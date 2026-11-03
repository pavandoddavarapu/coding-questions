class Solution {
    public int passwordStrength(String password) {
        HashSet<Character> hs=new HashSet<>();
        for(char c:password.toCharArray()){
            hs.add(c);
        }
        int count=0;
      
        for(Character c:hs){
            if(c>='a' && c<='z')count++;
            else if(c>='A' && c<='Z')count+=2;
            else if(c>='0' && c<='9')count+=3;
            else if(c=='!' || c=='@' || c=='#'|| c=='$')count+=5;
        }
        return count;
    }
}