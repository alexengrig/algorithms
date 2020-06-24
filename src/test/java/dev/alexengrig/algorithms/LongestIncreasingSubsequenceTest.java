package dev.alexengrig.algorithms;

import org.junit.Test;

import static dev.alexengrig.algorithms.LongestIncreasingSubsequence.Recursive;
import static dev.alexengrig.algorithms.LongestIncreasingSubsequence.any;
import static org.junit.Assert.assertEquals;

public class LongestIncreasingSubsequenceTest {
    @Test
    public void should_return_any() {
        assertEquals(1, any(new int[]{10}));
        assertEquals(2, any(new int[]{10, 11}));
        assertEquals(6, any(new int[]{10, 22, 9, 33, 21, 50, 41, 60, 80}));
        assertEquals(5, any(new int[]{1, 2, 3, 4, 5}));
        assertEquals(5, any(new int[]{1, 10, 2, 9, 3, 8, 4, 7, 5}));
        assertEquals(6, any(new int[]{1, 6, 2, 7, 3, 8, 4, 9, 5, 10}));
    }

    @Test
    public void should_return_any_recursive() {
        assertEquals(1, Recursive.any(new int[]{10}));
        assertEquals(2, Recursive.any(new int[]{10, 11}));
        assertEquals(6, Recursive.any(new int[]{10, 22, 9, 33, 21, 50, 41, 60, 80}));
        assertEquals(5, Recursive.any(new int[]{1, 2, 3, 4, 5}));
        assertEquals(5, Recursive.any(new int[]{1, 10, 2, 9, 3, 8, 4, 7, 5}));
        assertEquals(6, Recursive.any(new int[]{1, 6, 2, 7, 3, 8, 4, 9, 5, 10}));
    }
}