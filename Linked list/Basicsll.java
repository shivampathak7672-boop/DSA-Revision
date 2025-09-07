public class Basicsll {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args){
        node a = new node(5);
        node b = new node(4);
        node c = new node(8);
        a.next=b;
        b.next=c;
        // a->b->c
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        System.out.println(c.next);//null
        
        System.out.println(a.next);//address of b
        System.out.println(b);//address of b

        //priting the linked list with for loop
        node temp = a;
        for(int i=1;i<=3;i++){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");

        while(temp!=null){
            System.out.print(temp.data+ "->");
            temp=temp.next;
        }
    }
}
