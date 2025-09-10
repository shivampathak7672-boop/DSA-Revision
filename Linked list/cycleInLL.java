public class cycleInLL {
    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean cycle(node head) {
        node fast = head;
        node slow = head;

        while (fast != null && fast.next != null) { // Ensure fast and fast.next are not null
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) return true; // Cycle detected
        }
        return false; // No cycle detected
    }

    public static void main(String[] args) {
        node a = new node(1);
        node b = new node(2);
        node c = new node(3);
        node d = new node(4);

        a.next = b;
        b.next = c;
        c.next = d;
        // Uncomment the next line to create a cycle
        // d.next = b;

        boolean hasCycle = cycle(a);
        System.out.println("Cycle detected: " + hasCycle);
    }
}
