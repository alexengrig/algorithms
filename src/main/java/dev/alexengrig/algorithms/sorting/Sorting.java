package dev.alexengrig.algorithms.sorting;

public class Sorting {
    public static void swap(int[] array, int from, int to) {
        array[from] = array[from] + array[to];
        array[to] = array[from] - array[to];
        array[from] = array[from] - array[to];
    }
}
