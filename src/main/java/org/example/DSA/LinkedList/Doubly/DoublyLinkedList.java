package org.example.DSA.LinkedList.Doubly;

public class DoublyLinkedList {
    private DoublyNode head;
    private DoublyNode tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Duyệt từ đầu đến cuối danh sách
    public void traverseForward() {
        DoublyNode current = head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    // Duyệt từ cuối đến đầu danh sách
    public void traverseBackward() {
        DoublyNode current = tail;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getPrev();
        }
        System.out.println();
    }

    // Thêm nút vào đầu danh sách
    public void addFirst(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (head != null) {
            head.setPrev(newNode);
        }
        newNode.setNext(head);
        head = newNode;
        if (tail == null) {
            tail = newNode;
        }
    }

    // Thêm nút vào cuối danh sách
    public void addLast(int data) {
        DoublyNode newNode = new DoublyNode(data);

        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
    }
}
