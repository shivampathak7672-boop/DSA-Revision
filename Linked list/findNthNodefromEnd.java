 class findNthNodeFromEnd{
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static node findnode(node head,int n ){
        int size= 0;
        node temp = head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }

        int m= size-n+1;
        //mth node from startx  
         temp = head;
        for(int i=1;i<=m-1;i++){
            temp=temp.next;
        }
        return temp;
    }    
    
    public static void main(String[] args) {
        node a = new node(3);
        node b = new node(2);
        node c = new node(1);
        node d = new node(22);
        node e = new node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        node temp= findnode(a,4);
        System.out.println("The 2nd node from the end is: " + temp.data);
    }
}