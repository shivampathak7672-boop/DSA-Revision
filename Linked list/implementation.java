public class implementation {
    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class linkedlist {
        node head = null;
        node tail = null;

        void display() {
            node temp = head; // Use a temporary pointer to traverse the list
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        void insertAtEnd(int val) {
            node temp = new node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        void insertAtStart(int val) {
            node temp = new node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void insertAtAnyPosition(int val, int idx) {
            if (idx < 0) {
                System.out.println("Invalid index");
                return;
            }

            if (idx == 0) {
                insertAtStart(val);
                return;
            }

            node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                if (temp == null || temp.next == null) {
                    System.out.println("Index out of bounds");
                    return;
                }
                temp = temp.next;
            }

            node newNode = new node(val);
            newNode.next = temp.next;
            temp.next = newNode;

            if (newNode.next == null) {
                tail = newNode; // Update tail if inserted at the end
            }
        }

        void deleteAtAnyPosition(int idx) {
            if (idx < 0 || head == null) {
                System.out.println("Invalid index or empty list");
                return;
            }

            if (idx == 0) {
                // Delete the head node
                head = head.next;
                if (head == null) {
                    tail = null; // Update tail if the list becomes empty
                }
                return;
            }

            node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                if (temp == null || temp.next == null) {
                    System.out.println("Index out of bounds");
                    return;
                }
                temp = temp.next;
            }

            if (temp.next == null) {
                System.out.println("Index out of bounds");
                return;
            }

            temp.next = temp.next.next;

            if (temp.next == null) {
                tail = temp; // Update tail if the last node is deleted
            }
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtStart(3);
        ll.insertAtAnyPosition(6, 2);

        ll.display(); // Display the linked list
    }
}
