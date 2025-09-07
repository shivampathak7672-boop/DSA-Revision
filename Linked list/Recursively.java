 class Recursively {
    public static class node{
        int data;
        node next;
        node (int data){
            this.data= data;
            this.next=null;
        }
    }
    public static void display(node head){
        while(head!=null){
            System.out.print(head.data+"->");
        head= head.next;
        }
            System.out.print("null");
        
    }
    public static void displayRecursive(node head){
        if(head==null) return;
        System.out.print(head.data+"->>");
        displayRecursive(head.next);
        
    }
    public static void main(String[] args) {
        node a= new node (4);
        node b= new node(5);
        node c= new node (100);
        node d = new node(56);
        a.next=b;
        b.next=c;
        c.next=d;

        display(a);
        System.out.println();
        displayRecursive(a);
    }
}
