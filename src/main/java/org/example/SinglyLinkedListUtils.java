package org.example;

public class SinglyLinkedListUtils {

    // ==================================== INSERTION =====================================================
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

    // ==================================== DELETION =====================================================
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

    public Node deleteTail(Node head) {
        if (head == null) return null;
        if (head.next == null) return null;

        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }

        secondLast.next = null;

        return head;
    }

    public Node deleteNode(Node head, int position) {
        Node current = head;
        Node previous = null;

        if (current == null) return head;

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

    // ==================================== SEARCHING =====================================================
    public Node searchNode(Node head, int target){
        Node current = head;
        while (current != null){
            if(current.data == target)
                return current;
            current = current.next;
        }
        return null;
    }
    //===================================== Reversing the Linked List=======================================
    public Node reverse(Node head){
        Node previous = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous; // Đặt lại head là node cuối cùng sau khi đảo ngược
        return head;
    }
    //===================================== Floyd’s Cycle-Finding Algorithm (Hare-Tortoise algorithm) =======================================
    public boolean hasCycle(Node head) {
        if (head == null) return false;
        Node slow = head;  // Tortoise
        Node fast = head;  // Hare
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    //================================= Merge 2 Sorted List ==============================================
    public  Node mergeSortedList(Node head1, Node head2) {
        // Tạo node giả để bắt đầu danh sách kết quả
        Node dummy = new Node(-1);
        Node current = dummy;

        // Duyệt hai danh sách liên kết
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }

        // Nếu còn node trong danh sách 1
        if (head1 != null) {
            current.next = head1;
        }

        // Nếu còn node trong danh sách 2
        if (head2 != null) {
            current.next = head2;
        }

        // Trả về danh sách kết quả
        return dummy.next;
    }

}
