package org.example.DSA.Arrays;

public class ArrayUtils {
    public void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public void bubbleSort(int arr[]){
            int arrLength = arr.length;
            boolean swapped;
            for (int i = 0; i < arrLength - 1; i++) {
                swapped = false;
                for(int j = 0; j < arrLength - 1 - i; j++){
                    if(arr[j] > arr[j +1 ]){
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                }
                if(!swapped)
                    break;
            }
        }
    public void selectionSort(int arr[]){
        int arrLength = arr.length;
        for (int i = 0; i < arrLength - 1; i++) {
            //find index of min element of unsorted array
            int min_index = i;
            for(int j = i + 1; j < arrLength; j++){
                if(arr[j] < arr[min_index])
                    min_index = j;
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
    public void insertionSort(int arr[]){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public int linearSearch(int arr[], int target) {
        for(int i = 0; i < arr.length; i++)
            if(arr[i] == target)
                return i;
        return -1; // Nếu không tìm thấy phần tử
    }
    public int binarySearch(int arr[], int target) {
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1; // Nếu không tìm thấy phần tử
    }
    public void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Đệ quy chia đôi mảng
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            // Trộn hai mảng đã chia
            merge(array, left, mid, right);
        }
    }
    public void merge(int[] array, int left, int mid, int right) {
        // Tính kích thước của hai mảng con
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Tạo các mảng tạm thời
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Sao chép dữ liệu vào các mảng tạm thời
        for (int i = 0; i < n1; ++i) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            rightArray[j] = array[mid + 1 + j];
        }

        // Trộn các mảng tạm thời
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Sao chép các phần tử còn lại của leftArray nếu có
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Sao chép các phần tử còn lại của rightArray nếu có
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
    void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
    public void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
}
