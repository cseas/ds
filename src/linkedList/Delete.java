/* Delete a Node from a Linked List
 * https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list/problem
 * Abhijeet Singh
 * www.absingh.com
 */
package linkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

public class Delete {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter no. of nodes in Linked List: ");
        int N = Integer.parseInt(br.readLine());
        System.out.println("Enter elements:");

        // Creating an object of class LinkedList
        LinkedList<Integer> ll = new LinkedList<Integer>();

        // Adding elements to the linked list
        for(int i=0; i<N; i++) {
            // Add each new element to tail of linked list
            ll.add(Integer.parseInt(br.readLine()));
        }

        ll.remove(3);
        System.out.println("Linked List: " + ll);
    }
}
