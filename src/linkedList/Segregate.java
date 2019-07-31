/* https://www.geeksforgeeks.org/segregate-even-and-odd-elements-in-a-linked-list/
 * Given a Linked List of integers, write a function to modify the linked list
 * such that all even numbers appear before all the odd numbers in the modified
 * linked list. Also, keep the order of even and odd numbers same.
 * Created by Abhijeet Singh
 * www.absingh.com
 */
package linkedList;

public class Segregate {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node head; // head of list

    void segregateEvenOdd() {
        Node end = head;
        Node prev = null;
        Node curr = head;

        // get pointer to last Node
        while(end.next != null)
            end = end.next;

        Node new_end = end;

        // nodes before first even node
        while((curr.data % 2 != 0) && (curr != end)) {
            new_end.next = curr;
            curr = curr.next;

            new_end = new_end.next;
            new_end.next = null;
        }

        // if there's an even node
        if(curr.data % 2 == 0) {
            head = curr;

            // now curr points to first even node
            while(curr != end) {
                if(curr.data % 2 == 0) { // even
                    prev = curr;
                    curr = curr.next;
                } else { // odd
                    // break link b/w prev and curr
                    prev.next = curr.next;

                    // move curr to end
                    new_end.next = curr;
                    new_end = new_end.next;
                    new_end.next = null;

                    // update curr pointer
                    curr = prev.next;
                }
            }
        } else {
            // now curr is at end
            head = end.next;
            new_end.next = curr;
            new_end = new_end.next;
            new_end.next = null;
        }
    }

    // push new node to front of linked list
    void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    // print elements of linked list
    void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // program to test above functions
    public static void main(String[] args) {
        Segregate ll = new Segregate();

        // test input 1
        ll.push(6);
        ll.push(7);
        ll.push(1);
        ll.push(4);
        ll.push(5);
        ll.push(10);
        ll.push(12);
        ll.push(8);
        ll.push(15);
        ll.push(17);

        // test input 2
//        ll.push(10);
//        ll.push(12);
//        ll.push(8);

        // test input 3
//        ll.push(7);
//        ll.push(5);
//        ll.push(3);
//        ll.push(1);

        System.out.println("Original Linked List:");
        ll.printList();

        ll.segregateEvenOdd();

        System.out.println("Modified Linked List:");
        ll.printList();
    }
}
