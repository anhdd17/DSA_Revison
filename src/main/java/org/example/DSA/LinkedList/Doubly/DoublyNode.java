package org.example.DSA.LinkedList.Doubly;

public class DoublyNode {
    private int data;
    private DoublyNode prev;
    private DoublyNode next;

    public int getData() {
        return data;
    }

    public DoublyNode getNext() {
        return next;
    }

    public void setNext(DoublyNode next) {
        this.next = next;
    }

    public DoublyNode getPrev() {
        return prev;
    }

    public void setPrev(DoublyNode prev) {
        this.prev = prev;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DoublyNode(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
