package org.example.DSA.LinkedList.Singly;

public class SinglyNode {
    int data;
    SinglyNode next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public SinglyNode getNext() {
        return next;
    }

    public void setNext(SinglyNode next) {
        this.next = next;
    }

    public SinglyNode(int data) {
        this.data = data;
        this.next = null;
    }
}
