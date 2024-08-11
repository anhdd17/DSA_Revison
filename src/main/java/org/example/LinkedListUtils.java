package org.example;

public class LinkedListUtils {
    public Node insertAtFront(Node head, int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        return new_node;
    }
}
