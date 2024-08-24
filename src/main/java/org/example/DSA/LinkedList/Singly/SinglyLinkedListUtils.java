package org.example.DSA.LinkedList.Singly;

public class SinglyLinkedListUtils {

    // ==================================== INSERTION =====================================================
    public SinglyNode insertAtFront(SinglyNode head, int new_data){
        SinglyNode new_Singly_node = new SinglyNode(new_data);
        new_Singly_node.next = head;
        return new_Singly_node;
    }

    public SinglyNode insertAfter(SinglyNode head, int key, int newData)
    {
        SinglyNode curr = head;
        while (curr != null) {
            if (curr.data == key)
                break;
            curr = curr.next;
        }

        if (curr == null)
            return head;

        SinglyNode newSinglyNode = new SinglyNode(newData);
        newSinglyNode.next = curr.next;
        curr.next = newSinglyNode;
        return head;
    }

    public SinglyNode insertAtEnd(SinglyNode head, int newData)
    {
        SinglyNode newSinglyNode = new SinglyNode(newData);
        if (head == null) {
            return newSinglyNode;
        }

        SinglyNode last = head;

        while (last.next != null) {
            last = last.next;
        }
        last.next = newSinglyNode;
        return head;
    }

    // ==================================== DELETION =====================================================
    // Function to delete the head node
    public SinglyNode deleteHead(SinglyNode head)
    {
        if (head == null)
            return null;
        SinglyNode temp = head;
        head = head.next;
        temp = null;
        return head;
    }

    public SinglyNode deleteTail(SinglyNode head) {
        if (head == null) return null;
        if (head.next == null) return null;

        SinglyNode secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }

        secondLast.next = null;

        return head;
    }

    public SinglyNode deleteNode(SinglyNode head, int position) {
        SinglyNode current = head;
        SinglyNode previous = null;

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
    public SinglyNode searchNode(SinglyNode head, int target){
        SinglyNode current = head;
        while (current != null){
            if(current.data == target)
                return current;
            current = current.next;
        }
        return null;
    }
    //===================================== Reversing the Linked List=======================================
    public SinglyNode reverse(SinglyNode head){
        SinglyNode previous = null;
        SinglyNode current = head;

        while (current != null) {
            SinglyNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous; // Đặt lại head là node cuối cùng sau khi đảo ngược
        return head;
    }
    //===================================== Floyd’s Cycle-Finding Algorithm (Hare-Tortoise algorithm) =======================================
    public boolean hasCycle(SinglyNode head) {
        if (head == null) return false;
        SinglyNode slow = head;  // Tortoise
        SinglyNode fast = head;  // Hare
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
    public SinglyNode mergeSortedList(SinglyNode head1, SinglyNode head2) {
        // Tạo node giả để bắt đầu danh sách kết quả
        SinglyNode dummy = new SinglyNode(-1);
        SinglyNode current = dummy;

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
    //========================= Find the middle of a linked list =================
    public SinglyNode findMiddle(SinglyNode head) {
        if (head == null) return null;
        SinglyNode slow = head;
        SinglyNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // 'slow' is now pointing to the middle node
    }
    //===================Removing N-th Node from the End==========================
    public void removeNthFromEnd(int n, SinglyNode head) {
        SinglyNode dummy = new SinglyNode(0); // Dummy node to simplify edge cases
        dummy.next = head;
        SinglyNode first = dummy;
        SinglyNode second = dummy;

        // Move first pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        // Move both pointers until first reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Now, second is pointing to the node before the target node
        second.next = second.next.next;
    }
    //===================== Find node intersection of Two Linked Lists
    public SinglyNode getIntersectionNode(SinglyNode headA, SinglyNode headB) {
        if (headA == null || headB == null) return null;

        SinglyNode a = headA;
        SinglyNode b = headB;

        // Move through both lists and switch heads when reaching the end
        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        // If a == b, then they are intersecting at this node, else it's null
        return a;
    }

    // ======================== Traversing ================================
    public void printLinkedList(SinglyNode head)
    {
        SinglyNode curr = head;
        while (curr != null) {
            System.out.print(" " + curr.data);
            curr = curr.next;
        }
        System.out.println();
    }
}
