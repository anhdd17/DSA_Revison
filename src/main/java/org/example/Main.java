package org.example;

public class Main {
    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();

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

        int[] array = {12, 11, 13, 5, 6, 7};
        System.out.println("Mảng ban đầu:");
        printArray(array);

        arrayUtils.mergeSort(array, 0, array.length - 1);

        System.out.println("\nMảng sau khi sắp xếp:");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}