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
        // Print the data of the first node
        System.out.println(a.data);
        // Print the data of the second node (a.next points to b)
        System.out.println(a.next.data);
        // Print the data of the third node (a.next.next points to c)
        System.out.println(a.next.next.data);
        // Print null as c.next is null (end of the list)
        System.out.println(c.next);
        
        // Print the memory address of the second node (b)
        System.out.println(a.next);
        // Print the memory address of the second node (b) explicitly
        System.out.println(b);

        // Printing the linked list using a for loop
        node temp = a; // Start from the head of the list
        for(int i = 1; i <= 3; i++) {
            System.out.print(temp.data + "->"); // Print the data of the current node
            temp = temp.next; // Move to the next node
        }
        System.out.print("null"); // End of the list

        // Reset temp to the head of the list before the while loop
        temp = a;
        // Printing the linked list using a while loop
        while(temp != null) {
            System.out.print(temp.data + "->"); // Print the data of the current node
            temp = temp.next; // Move to the next node
        }
        System.out.print("null"); // End of the list
    }
}
