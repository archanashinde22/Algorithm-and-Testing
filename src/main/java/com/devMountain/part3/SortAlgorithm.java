package com.devMountain.part3;

public class SortAlgorithm {

    public static void main(String[] args) {

        // Choose one of the following to implement: Insertion Sort Quick Sort Merge Sort
        //
        //What sorting algorithms have the best runtime efficiency? Insertion sort has best run RunTime Complexity
        // What are the scenarios for the best case, worst case, and average case runtime efficiency?
//        insertion Sort -  best - O(n)   worst - O(n^2)   average - O(n^2)  runtime efficiency
        //        Quick Sort -  best - O(n log(n))   worst - O(n^2)   average -O(n log(n))  runtime efficiency
        //        Merge Sort -  best - O(n log(n))   worst - O(n log(n))  average -O(n log(n))  runtime efficiency

        int[] intArr = {20, 35, -15, 7, 55, 1, -22};
        insertionSort(intArr);


    }

    public static void insertionSort(int[] arr){

        // Keeps track of unsorted index
        for (int unsortedIndex = 1; unsortedIndex < arr.length; unsortedIndex++){
            int newElement = arr[unsortedIndex];

            int i;

            // Look  for the correct position to insert element (shifting)
            for (i = unsortedIndex; i > 0 && arr[i-1] > newElement; i--){
                arr[i] = arr[i-1];
            }

            arr[i] = newElement;
        }

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

}
