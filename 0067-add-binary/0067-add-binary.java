class Solution {
    public String addBinary(String a, String b) {
        StringBuilder s=new StringBuilder();
        StringBuilder aa=new StringBuilder(a);
        StringBuilder bb=new StringBuilder(b);
        while(aa.length()>bb.length()){
            bb.insert(0,'0');
            
        }
        while(bb.length()>aa.length()){
            aa.insert(0,'0');
            
        }
        int i=aa.length()-1;
        int carry=0;
        while(i>=0){
            if(aa.charAt(i)=='1' && bb.charAt(i)=='1'){
                if(carry==0){
                s.insert(0,'0');
                carry=1;}
                else{
                    s.insert(0,'1');
                    carry=1;
                }
            }
            else{
                if(aa.charAt(i)=='1' || bb.charAt(i)=='1') {
                    if(carry==1){s.insert(0,'0');}
                    else{s.insert(0,'1');}
                    
                }
                else{
                    if(carry==1){s.insert(0,'1');carry=0;}
                    else{s.insert(0,'0');}
                }
            }
            i--;
        }
        System.out.println(aa);System.out.print(bb);
        if(carry==1)s.insert(0,'1');
        return s.toString();
    }
}