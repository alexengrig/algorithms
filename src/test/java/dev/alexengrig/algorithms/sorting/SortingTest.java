package dev.alexengrig.algorithms.sorting;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortingTest {
    @Test
    public void should_swap() {
        int[] array = {2, 1};
        Sorting.swap(array, 0, 1);
        assertArrayEquals(new int[]{1, 2}, array);
        Sorting.swap(array, 0, 1);
        assertArrayEquals(new int[]{2, 1}, array);
    }
}