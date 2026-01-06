package com.sortingalogorithm.insertion;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {8, 3, 5, 2};

        insertionSort(arr);

        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
	public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];    
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key; 
        }
    }

}
