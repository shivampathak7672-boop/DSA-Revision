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

    public static int displaycount(node head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    public static void main(String[] args) {
        node a= new node (4);
        node b= new node(5);
        node c= new node (100);
        node d = new node(56);
        a.next=b;
        b.next=c;
        c.next=d;

        // display(a);    //function to displaay a linked list
        // System.out.println();
        // displayRecursive(a); //function to print a linked list recursively
        int count= displaycount(a);
        System.out.println("count of ll is :"+ count);
    }
}
