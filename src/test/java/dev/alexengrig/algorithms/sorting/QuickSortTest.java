package dev.alexengrig.algorithms.sorting;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class QuickSortTest {
    @Test
    public void should_sort() {
        int[] array = {3, 1, 2, 5, 4};
        QuickSort.sort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
        array = new int[]{1, 2, 3, 4, 5};
        QuickSort.sort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
        array = new int[]{5, 4, 3, 2, 1};
        QuickSort.sort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }
}