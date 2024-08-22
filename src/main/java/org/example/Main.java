package org.example;

public class Main {
    public static void main(String[] args) {
        //======================== ARRAY ===========================================================
//        ArrayUtils arrayUtils = new ArrayUtils();

//        int[] myArray = {3, 6, 5, 2, 3, 6, 3, 1, 5};
//        System.out.println("Array before sorting:");
//        for (int i = 0; i < myArray.length; i++) {
//            System.out.print((i != myArray.length - 1) ? myArray[i] + " " : myArray[i] + "\n");
//        }

        //arrayUtils.bubbleSort(myArray);
        //arrayUtils.selectionSort(myArray);
        //arrayUtils.insertionSort(myArray);
        ////linear search
        //System.out.println("Search index of first element = 3 by linear search: " + arrayUtils.linearSearch(myArray, 3));
        ////binary search
//        arrayUtils.selectionSort(myArray);
//        System.out.println("Search index of first element = 3 by binary search: " + arrayUtils.binarySearch(myArray, 3));
//        System.out.println("\nArray after sorting:");
//        for (int i = 0; i < myArray.length; i++) {
//            System.out.print(myArray[i] + " ");
//        }

        //merging two sorted arrays
//        int[] arr1 = {1, 3, 4, 5};
//        int[] arr2 = {2, 4, 6, 8};
//        int n1 = arr1.length;
//        int n2 = arr2.length;
//        int[] result = new int[n1 + n2];
//        int i = 0, j = 0, k = 0;
//        while(i < n1 && j < n2){
//            if(arr1[i] <= arr2[j])
//                result[k++] = arr1[i++];
//            else
//                result[k++] = arr2[j++];
//        }
//        while(i < n1){
//            result[k++] = arr1[i++];
//        }
//        while(j < n2){
//            result[k++] = arr2[j++];
//        }
//        for (int num : result) {
//            System.out.print(num + " ");
//        }

//        int[] array = {12, 11, 13, 5, 6, 7};
//        System.out.println("Mảng ban đầu:");
//        printArray(array);
//
//        //arrayUtils.mergeSort(array, 0, array.length - 1);
//        arrayUtils.quickSort(array, 0, array.length - 1);
//
//        System.out.println("\nMảng sau khi sắp xếp:");
//        printArray(array);

        //======================== LINKED LIST ===========================================================
        SinglyLinkedListUtils linkedListUtils = new SinglyLinkedListUtils();
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(2);


        // Print the original list
        System.out.println("Original Linked List:");
        printLinkedList(head);

        //// Insert a new node at the front of the list
//        System.out.println(
//                "After inserting Nodes at the front:");
//        int data = 1;
//        head = linkedListUtils.insertAtFront(head, data);
//        // Print the updated list
//        printLinkedList(head);

        //// Key: Insert node after key
        //int key = 3, newData = 11;

        // Insert a new node with data 4 after the node
        // having data 3
//        head = linkedListUtils.insertAfter(head, key, newData);
//        System.out.println("Linked List after insertion after insert node having data = 3: ");
//        printLinkedList(head);

        // Example of appending a node at the end
        head = linkedListUtils.insertAtEnd(head, 1);
        System.out.print("\nAfter inserting 1 at the end:");
        printLinkedList(head);
        head = linkedListUtils.deleteNode(head, 2);
        System.out.print("\nAfter deleting node at the position 2:");
        printLinkedList(head);
        System.out.print("\nAfter deleting tail:");
        head = linkedListUtils.deleteTail(head);
        printLinkedList(head);
        System.out.print("\nSearching node having data = 4: ");
        System.out.print(linkedListUtils.searchNode(head, 4).data);
        System.out.print("\nLinked list after reverse:" );
        head = linkedListUtils.reverse(head);
        printLinkedList(head);
        System.out.print("\nLinked list has loop? " + linkedListUtils.hasCycle(head));


        // Create a hard-coded linked list:
        // 2 -> 4 -> 8 -> 9
        Node first = new Node(2);
        first.next = new Node(4);
        first.next.next = new Node(8);
        first.next.next.next = new Node(9);

        // Create another hard-coded linked list:
        // 1 -> 3 -> 8 -> 10
        Node second = new Node(1);
        second.next = new Node(3);
        second.next.next = new Node(8);
        second.next.next.next = new Node(10);

        Node mergedList = linkedListUtils.mergeSortedList(first, second);
        System.out.println("\nMerging 2 sorted linked lists:");
        printLinkedList((mergedList));

        // find middle of linked list
        System.out.println("The middle of linked list is " + linkedListUtils.findMiddle(mergedList).data);



    }

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void printLinkedList(Node head)
    {
        Node curr = head;
        while (curr != null) {
            System.out.print(" " + curr.data);
            curr = curr.next;
        }
        System.out.println();
    }
}