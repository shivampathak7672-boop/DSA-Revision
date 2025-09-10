public class cycleIntersectinLL {
    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null; // Fix: Initialize next to null
        }
    }

    public static node cycle(node head) {
        node slow = head;
        node fast = head;

        // Detect if a cycle exists
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) break; // Cycle detected
        }

        // If no cycle is detected, return null
        if (fast == null || fast.next == null) {
            return null;
        }

        // Find the starting point of the cycle
        node t = head;
        while (t != slow) { // Fix: Corrected condition
            t = t.next;
            slow = slow.next;
        }
        return t; // Starting point of the cycle
    }

    public static void main(String[] args) {
        node a = new node(4);
        node b = new node(1);
        node c = new node(2);
        node d = new node(3);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b; // Create a cycle

        node ans = cycle(a);
        if (ans != null) {
            System.out.println("Cycle starts at node with data: " + ans.data);
        } else {
            System.out.println("No cycle detected");
        }
    }
}