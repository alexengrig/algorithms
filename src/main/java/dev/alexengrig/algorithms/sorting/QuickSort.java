package dev.alexengrig.algorithms.sorting;

import java.util.Random;

public class QuickSort {

    public static final Random RANDOM = new Random();

    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    public static void sort(int[] array, int begin, int end) {
        if (begin < end) {
            int partition = partition(array, begin, end);
            sort(array, begin, partition - 1);
            sort(array, partition + 1, end);
        }
    }

    public static int partition(int[] array, int begin, int end) {
        int pivot = pivot(array, begin, end);
        for (int i = begin; i < end; i++) {
            if (array[i] < pivot) {
                Sorting.swap(array, begin, i);
                begin++;
            }
        }
        array[end] = array[begin];
        array[begin] = pivot;
        return begin;
    }

    public static int pivot(int[] array, int begin, int end) {
        int index = RANDOM.nextInt(end - begin) + begin;
        int temp = array[index];
        array[index] = array[end];
        array[end] = temp;
        return temp;
    }
}
