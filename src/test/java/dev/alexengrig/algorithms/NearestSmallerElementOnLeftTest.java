package dev.alexengrig.algorithms;

import org.junit.Test;

import static dev.alexengrig.algorithms.NearestSmallerElementOnLeft.indices;
import static org.junit.Assert.assertArrayEquals;

public class NearestSmallerElementOnLeftTest {
    @Test
    public void should_return_indices() {
        assertArrayEquals(new int[]{-1, 0, 1}, indices(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{-1, -1, -1}, indices(new int[]{3, 2, 1}));
        assertArrayEquals(new int[]{-1, -1, 1}, indices(new int[]{2, 1, 3}));
        assertArrayEquals(new int[]{-1, -1, 1, 1, 1, 4}, indices(new int[]{3, 0, 2, 1, 1, 2}));
        assertArrayEquals(new int[]{-1, -1, -1, -1, 3}, indices(new int[]{1, 1, 1, 1, 2}));
    }
}