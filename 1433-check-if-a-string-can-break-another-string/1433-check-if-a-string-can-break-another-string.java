class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        char a[]=s1.toCharArray();
        char b[]=s2.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);
        boolean f1=true;boolean f2=true;
        for(int i=0;i<s1.length();i++){
            if(a[i]<b[i])f1=false;
            if(a[i]>b[i])f2=false;
            if(f1==false && f2==false)return false;
        }
        return f1||f2;
    }
}