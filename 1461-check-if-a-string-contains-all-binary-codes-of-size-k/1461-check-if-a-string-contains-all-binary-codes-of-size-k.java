class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> hm=new HashSet<>();
        int left=0;
        int right=0;
        if(k>s.length())return false;
        StringBuilder sb=new StringBuilder();
        while(right<k){sb.append(s.charAt(right));right++;}
        for(int i=right;i<s.length();i++){
            hm.add(sb.toString());
            sb.deleteCharAt(0);
            sb.append(s.charAt(i));
        }
        hm.add(sb.toString());
        int total=(int)Math.pow(2,k);
        for(int i=0;i<total;i++){
            String st=Integer.toBinaryString(i);
            while(st.length()<k){
                st="0"+st;
            }
            if(!hm.contains(st))return false;
        }
        return true;
    }
}