class BrowserHistory {
    public class Node{
        String val;
        Node next;
        Node prev;
        public Node(String val){
            this.val=val;
        }
    }
    Node head=null;
    public BrowserHistory(String homepage) {
        head=new Node(homepage);
    }
    
    public void visit(String url) {
        Node n=new Node(url);
        
        if(head!=null){
        head.next=n;
        n.prev=head;
        head=head.next;}
        else{
            head=n;
        }
    }
    
    public String back(int steps) {
        int i=0;
        Node h=head;
        while(i<steps && head.prev!=null){if(head==null){head=h;return head.val;}
        head=head.prev;i++;}
        return head.val;
    }
    
    public String forward(int steps) {
        
        int i=0;
        Node h=head;
        while(i<steps && head.next!=null){
            if(head==null){head=h;return h.val;}
            
            head=head.next;i++;}
        return head.val;

    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */