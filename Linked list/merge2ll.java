public class merge2ll {     // Merge two sorted linked lists in O(n) space

    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to merge two sorted linked lists
    public static node mergell(node list1, node list2) {
        // Create a dummy node to simplify edge cases
        node dummy = new node(-1);
        node temp = dummy;

        // Traverse both lists and merge them in sorted order
        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                temp.next = new node(list1.data); // Add node from list1
                list1 = list1.next; // Move to the next node in list1
            } else {
                temp.next = new node(list2.data); // Add node from list2
                list2 = list2.next; // Move to the next node in list2
            }
            temp = temp.next; // Move the temp pointer forward
        }

        // If one list is exhausted, append the remaining nodes of the other list
        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }

        return dummy.next; // Return the merged list, skipping the dummy node
    }

    public static void main(String[] args) {
        // Create two sorted linked lists
        node list1 = new node(1);
        list1.next = new node(3);
        list1.next.next = new node(5);

        node list2 = new node(2);
        list2.next = new node(4);
        list2.next.next = new node(6);

        // Merge the two lists
        node mergedList = mergell(list1, list2);

        // Print the merged list
        node temp = mergedList;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
