package com.deven;

public class CircularLL {

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    private Node tail;

    CircularLL() {
        tail = null;
    }

    void insertEmpty(int data) {
        Node temp = new Node(data);
        temp.next = temp;
        tail = temp;
    }

    void insertAtBeginning(int data) {
        if (tail == null) {
            insertEmpty(data);
            return;
        }
        Node temp = new Node(data);
        temp.next = tail.next;
        tail.next = temp;
    }

    void insertAtEnd(int data) {
        if (tail == null) {
            insertEmpty(data);
            return;
        }
        Node temp = new Node(data);
        temp.next = tail.next;
        tail.next = temp;
        tail = temp;
    }

    void insertAfter(int key, int data) {
        if (tail == null) return;

        Node curr = tail.next;

        do {
            if (curr.data == key) {
                Node temp = new Node(data);
                temp.next = curr.next;
                curr.next = temp;

                if (curr == tail)
                    tail = temp;

                return;
            }
            curr = curr.next;
        } while (curr != tail.next);
    }

    void deleteBeginning() {
        if (tail == null) return;

        Node head = tail.next;

        if (head == tail) {
            tail = null;
        } else {
            tail.next = head.next;
        }
    }

    void deleteEnd() {
        if (tail == null) return;

        Node curr = tail.next;

        if (curr == tail) {
            tail = null;
            return;
        }

        while (curr.next != tail)
            curr = curr.next;

        curr.next = tail.next;
        tail = curr;
    }

    void deleteValue(int key) {
        if (tail == null) return;

        Node curr = tail.next;
        Node prev = tail;

        do {
            if (curr.data == key) {

                if (curr == tail && curr.next == tail) {
                    tail = null;
                    return;
                }

                prev.next = curr.next;

                if (curr == tail)
                    tail = prev;

                return;
            }

            prev = curr;
            curr = curr.next;
        } while (curr != tail.next);
    }

    void display() {
        if (tail == null) {
            System.out.println("List empty");
            return;
        }

        Node curr = tail.next;

        do {
            System.out.print(curr.data + " ");
            curr = curr.next;
        } while (curr != tail.next);

        System.out.println();
    }

    public static void main(String[] args) {
        CircularLL cll = new CircularLL();

        cll.insertAtEnd(10);
        cll.insertAtEnd(20);
        cll.insertAtBeginning(5);
        cll.insertAfter(10, 15);

        cll.display();

        cll.deleteBeginning();
        cll.deleteEnd();
        cll.deleteValue(15);

        cll.display();
    }
}
