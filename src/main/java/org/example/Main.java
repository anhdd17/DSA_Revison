package org.example;

import org.example.DSA.LinkedList.Doubly.DoublyLinkedList;
import org.example.DSA.LinkedList.Doubly.DoublyNode;


public class Main {
    public static void main(String[] args) {

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addFirst(10);
        doublyLinkedList.addFirst(20);
        doublyLinkedList.addFirst(30);
        doublyLinkedList.addFirst(40);
        doublyLinkedList.addFirst(50);
        doublyLinkedList.addLast(11);
        doublyLinkedList.addLast(21);
        doublyLinkedList.addLast(31);


        System.out.println("Danh sách từ đầu đến cuối:");
        doublyLinkedList.traverseForward();
        System.out.println("\nDanh sách từ cuối đến đầu:");
        doublyLinkedList.traverseBackward();
    }




}