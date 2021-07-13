package algorithm;

import java.util.PriorityQueue;
import java.util.Queue;

public class Sort {
    public static void main(String[] args) {
        int[] a = {5,3,2,1,4};
//        selectSort(a);
//        insertionSort(a);
//        bubbleSort(a);
//        mergeSort(a,0,a.length-1);
        heapSort(a);
        for (int n : a){
            System.out.println(n);
        }
    }

    public static void selectSort(int[] arr) {
        int len = arr.length;
        int minIndex, temp;
        for (int i = 0; i < len-1; i++){
            minIndex = i;
            for (int j = i+1; j < len; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void insertionSort(int[] arr) {
        int len = arr.length;
        for (int i = 1; i < len-1; ++i) {
            int value = arr[i];
            int j = i-1;
            for (; j > 0; --j) {
                if (arr[j] > value){
                   arr[j+1] = arr[j];//数据搬移
                }else {
                    break;
                }
            }
            arr[j+1] = value;//插入数据
        }
    }

    public static void bubbleSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; ++i) {
            boolean flag = false;
            for (int j = 0; j < len- i - 1; ++j) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }

    public static void quickSort(int[] arr, int begin, int end) {
        if (end <= begin) {
            return;
        }

        int pivot = partition(arr, begin, end);
        quickSort(arr, begin, pivot - 1);
        quickSort(arr, pivot + 1, end);
    }

    private static int partition(int[] arr, int begin, int end) {
        int pivot = end, counter = begin;
        for (int i = begin; i < end; i++){
            if (arr[i] < arr[pivot]) {
                int temp = arr[counter];
                arr[counter] = arr[i];
                arr[i] = temp;
                counter++;
            }
        }
        int temp = arr[counter];
        arr[counter] = arr[pivot];
        arr[pivot] = temp;

        return counter;
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) >> 1;//(left + right)/2

        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);
        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right){
        int[] temp = new int[right-left+1];
        int i = left; int j = mid + 1; int k = 0;

        while (i <= mid && j <= right) {
            temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        for (int p = 0; p < temp.length; p++) {
            arr[left+p] = temp[p];
        }
    }

    private static void heapSort(int[] arr) {
        Queue<Integer> queue = new PriorityQueue<Integer>();
        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = queue.poll();
        }
    }
}
