package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arrayB = {10, 40, 50, 70, 10, 20};
        bubbleSort(arrayB);
        System.out.println(Arrays.toString(arrayB));

        int[] arrayS = {3, 16, 9, 4, 6, 15};
        selectionSort(arrayS);
        System.out.println(Arrays.toString(arrayS));

        int[] arrayI = {6, 7,14, 9, 24, 5};
        insertionSort(arrayI);
        System.out.println(Arrays.toString(arrayI));
    }
    private static void bubbleSort(int[] array) {
        for (int barrier = array.length - 1; barrier >= 1; barrier--) {
            for (int index = barrier - 1; index >= 0; index--) {
                if (array[index] > array[barrier]) {
                    swap(array, index, barrier);
                }
            }
        }

    }



    private static void selectionSort(int[] array) {
        for (int barrier = array.length - 1; barrier > 0; barrier--) {
            int maxElement = array[barrier];
            int indexOfMax = barrier;
            for (int index = barrier - 1; index >= 0; index--) {
                if (array[index] > maxElement) {
                    maxElement = array[index];
                    indexOfMax = index;
                }
            }
            if (barrier != indexOfMax) {
                swap(array, barrier, indexOfMax);
            }
        }
    }


    private static void swap(int array[], int firstIndex, int secondIndex) {
        int tmp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = tmp;
    }

    private static void insertionSort(int[] arr) {
        for (int k = arr.length - 2; k >= 0; k--) {
            if (arr[k] > arr[k + 1]) {
                int newElement = arr[k + 1];
                arr[k + 1] = arr[k];
                int location = k;
                while (location > 0 && arr[location - 1] > newElement) {
                    arr[location] = arr[location - 1];
                    location--;
                }
                arr[location] = newElement;
            }
        }
    }
}