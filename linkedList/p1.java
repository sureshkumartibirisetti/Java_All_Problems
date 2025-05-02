package linkedList;

import org.w3c.dom.Node;

import java.util.*;

public class p1 {
    Node1 head=null;

    // Add node at end
    public void add(int data) {
        Node1 newNode = new Node1(data);

        if (head == null) {
            head = newNode;
        } else {
            Node1 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Display the list
    public void display() {
        Node1 current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Delete node at specific position
    public void deleteAtPosition(int position) {
        if (head == null) return;

        if (position == 0) {
            head = head.next;
            return;
        }

        Node1 current = head;
        for (int i = 0; i < position - 1 && current.next != null; i++) {
            current = current.next;
        }

        if (current.next != null)
            current.next = current.next.next;
    }

    public static void main(String[] args) {
        p1 list = new p1();
        list.add(10);
        list.add(20);
        list.add(30);
        list.display(); // 10 -> 20 -> 30 -> null

        list.deleteAtPosition(1);
        list.display(); // 10 -> 30 -> null
    }
}
