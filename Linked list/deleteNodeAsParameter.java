public class deleteNodeAsParameter {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Function to delete a node given as a parameter
    public static void deleteNode(Node node) {
        if (node == null || node.next == null) {
            throw new IllegalArgumentException("Node to be deleted cannot be null or the last node");
        }
        node.val = node.next.val; // Copy the value of the next node to the current node
        node.next = node.next.next; // Bypass the next node
    }

    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(9);
        a.next = b;
        b.next = c;
        c.next = d;

        System.out.println("Original list:");
        printList(a);

        // Delete node b (value 5)
        deleteNode(b);

        System.out.println("List after deleting node with value 5:");
        printList(a);
    }

    // Helper function to print the linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
