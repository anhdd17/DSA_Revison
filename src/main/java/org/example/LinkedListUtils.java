package org.example;

public class LinkedListUtils {
    public Node insertAtFront(Node head, int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        return new_node;
    }

    public Node insertAfter(Node head, int key, int newData)
    {
        Node curr = head;
        while (curr != null) {
            if (curr.data == key)
                break;
            curr = curr.next;
        }

        if (curr == null)
            return head;

        Node newNode = new Node(newData);
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }

    public Node insertAtEnd(Node head, int newData)
    {
        Node newNode = new Node(newData);
        if (head == null) {
            return newNode;
        }

        Node last = head;

        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        return head;
    }

    // Function to delete the head node
    public  Node deleteHead(Node head)
    {
        if (head == null)
            return null;
        Node temp = head;
        head = head.next;
        temp = null;
        return head;
    }

    public Node deleteNode(Node head, int position) {
        Node current = head;
        Node previous = null;

        // Base case if linked list is empty
        if (current == null)
            return head;

        // Case 1: Head is to be deleted
        if (position == 1) {
            head = current.next;
            return head;
        }

        // Case 2: Node to be deleted is in middle
        // Traverse till given position
        for (int i = 1; current != null && i < position; i++) {
            previous = current;
            current = current.next;
        }

        // If given position is found, delete node
        if (current != null) {
            previous.next = current.next;
        } else {
            System.out.println("Data not present");
        }

        return head;
    }

}
