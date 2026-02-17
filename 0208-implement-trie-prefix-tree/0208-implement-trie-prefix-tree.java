class Trie {
    Node root;
    public class Node{
        Node links[]=new Node[26];
        Node(){
            for(int i=0;i<26;i++){
            links[i]=null;
        }
        }
        boolean end=false;
        
    }
    public Trie() {
        root=new Node();
        
    }
    
    public void insert(String word) {
        Node temp=root;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(temp.links[c-'a']==null){
                temp.links[c-'a']=new Node();
            }
                
            temp=temp.links[c-'a'];
        }
        temp.end=true;
    }
    
    public boolean search(String word) {
        Node temp=root;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(temp.links[c-'a']==null)return false;
            else{temp=temp.links[c-'a'];}
        }

        return temp.end;
    }
    
    public boolean startsWith(String word) {
        Node temp=root;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(temp.links[c-'a']==null)return false;
            else{temp=temp.links[c-'a'];}
        }

        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */