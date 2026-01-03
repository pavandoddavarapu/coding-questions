class Solution {
    public ArrayList<String> binstr(int n) {
        // code here
        ArrayList<String> arr=new ArrayList<>();
        StringBuilder s=new StringBuilder();
        StringBuilder st=new StringBuilder();
        for(int i=0;i<n;i++){
            s.append("0");
            st.append("1");
        }
        int a=1;
        for(int i=0;i<n;i++){
            a=a*2;
        }
        int k=0;
        while(k<a){
            arr.add(s.toString());
            int i=n-1;
            while(i>=0 &&s.charAt(i)=='1'){
                s.setCharAt(i,'0');
                i--;
            }
            if(i!=-1)
            s.setCharAt(i,'1');
            
            k++;
            }
            
            // arr.add(st.toString());
            return arr;
        }
    }