/* Compare two Linked Lists
 * https://www.hackerrank.com/challenges/compare-two-linked-lists/problem
 * Abhijeet Singh
 * www.absingh.com
 */
package linkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Compare {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter no. of nodes in first Linked List: ");
        int N1 = Integer.parseInt(br.readLine());
        System.out.println("Enter elements of first Linked List:");

        // Creating an object of class LinkedList
        LinkedList<Integer> ll1 = new LinkedList<Integer>();

        // Adding elements to the linked list
        for(int i=0; i<N1; i++) {
            // Add each new element to tail of linked list
            ll1.add(Integer.parseInt(br.readLine()));
        }

        System.out.print("Enter no. of nodes in second Linked List: ");
        int N2 = Integer.parseInt(br.readLine());
        System.out.println("Enter elements of second Linked List:");

        // Creating an object of class LinkedList
        LinkedList<Integer> ll2 = new LinkedList<Integer>();

        // Adding elements to the linked list
        for(int i=0; i<N2; i++) {
            // Add each new element to tail of linked list
            ll2.add(Integer.parseInt(br.readLine()));
        }

        if(N1 != N2) {
            System.out.println("Not equal");
            System.exit(0);
        }

        for(int i=0; i<N1; i++) {
            if(ll1.get(i) != ll2.get(i)) {
                System.out.println("Not equal");
                System.exit(0);
            }
        }
        System.out.println("Equal");
    }
}
