class Solution {
    public int compress(char[] chars) {
        int ans=0;
        int left=0;
        int right=0;
        while(right<chars.length){
            char c=chars[left];
            while(right<chars.length && chars[right]==c){right++;}
            if(right-left-1==0){chars[ans]=c;left=right; ans++;}
            else {chars[ans]=c;ans++;
            String n=right-left+"";
            for(int i=0;i<n.length();i++){

                chars[ans]=n.charAt(i);ans++;}
            
            left=right;
        }}

        return ans;
    }
}