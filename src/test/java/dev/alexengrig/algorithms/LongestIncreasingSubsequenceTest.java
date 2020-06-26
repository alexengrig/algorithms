package dev.alexengrig.algorithms;

import org.junit.Test;

import static dev.alexengrig.algorithms.LongestIncreasingSubsequence.Recursive;
import static dev.alexengrig.algorithms.LongestIncreasingSubsequence.length;
import static org.junit.Assert.assertEquals;

public class LongestIncreasingSubsequenceTest {
    @Test
    public void should_return_length() {
        assertEquals(1, length(new int[]{10}));
        assertEquals(2, length(new int[]{10, 11}));
        assertEquals(6, length(new int[]{10, 22, 9, 33, 21, 50, 41, 60, 80}));
        assertEquals(5, length(new int[]{1, 2, 3, 4, 5}));
        assertEquals(5, length(new int[]{1, 10, 2, 9, 3, 8, 4, 7, 5}));
        assertEquals(6, length(new int[]{1, 6, 2, 7, 3, 8, 4, 9, 5, 10}));
    }

    @Test
    public void should_return_length_recursive() {
        assertEquals(1, Recursive.length(new int[]{10}));
        assertEquals(2, Recursive.length(new int[]{10, 11}));
        assertEquals(6, Recursive.length(new int[]{10, 22, 9, 33, 21, 50, 41, 60, 80}));
        assertEquals(5, Recursive.length(new int[]{1, 2, 3, 4, 5}));
        assertEquals(5, Recursive.length(new int[]{1, 10, 2, 9, 3, 8, 4, 7, 5}));
        assertEquals(6, Recursive.length(new int[]{1, 6, 2, 7, 3, 8, 4, 9, 5, 10}));
    }
}